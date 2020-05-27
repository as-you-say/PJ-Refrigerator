package org.ays.refrigerator.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseStatus(value= HttpStatus.CONFLICT)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public Response conflict() {
        Response response = new Response();
        response.setStatus(Status.HTTP_CONFLICT);
        logger.error(response.toString());
        return response;
    }

    @ExceptionHandler({SQLException.class, DataAccessException.class})
    public Response databaseError(){
        Response response = new Response();
        response.setStatus(Status.DATABASE_ERROR);
        logger.error(response.toString());
        return response;
    }

    @ExceptionHandler(Exception.class)
    public Response handleError(){
        Response response = new Response();
        response.setStatus(Status.ERROR);
        logger.error(response.toString());
        return response;
    }
}
