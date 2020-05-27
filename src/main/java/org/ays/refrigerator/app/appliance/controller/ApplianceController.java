package org.ays.refrigerator.app.appliance.controller;

import org.ays.refrigerator.app.Response;
import org.ays.refrigerator.app.Status;
import org.ays.refrigerator.app.appliance.model.Appliance;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplianceController {

    /* GET */
    @GetMapping(value = "/appliances")
    public Response getAppliances(){
        Response response = new Response();
        response.setStatus(Status.SUCCESS);
        return response;
    }
    @GetMapping(value = "/appliance/{id}")
    public Response getAppliance(@PathVariable String id) {
        Response response = new Response();
        response.setStatus(Status.SUCCESS);

        return response;
    }

    /* POST */
    @PostMapping(value = "/appliance")
    public Response postAppliance(@RequestBody Appliance appliance){
        Response response = new Response();
        response.setStatus(Status.SUCCESS);

        return response;
    }
    @PostMapping(value = "/appliances")
    public Response postAppliances(@RequestBody List<Appliance> appliances){
        Response response = new Response();
        response.setStatus(Status.SUCCESS);

        return response;
    }

    /* PUT */
    @PutMapping(value = "/appliance")
    public Response putAppliance(@RequestBody Appliance appliance){
        Response response = new Response();
        response.setStatus(Status.SUCCESS);

        return response;
    }
    @PutMapping(value = "/appliances")
    public Response putAppliances(@RequestBody List<Appliance> appliances){
        Response response = new Response();
        response.setStatus(Status.SUCCESS);

        return response;
    }

    /* DELETE */
    @DeleteMapping(value = "/appliance")
    public Response deleteAppliance(@RequestBody Appliance appliance){
        Response response = new Response();
        response.setStatus(Status.SUCCESS);

        return response;
    }
    @DeleteMapping(value = "/appliances")
    public Response deleteAppliances(@RequestBody List<Appliance> appliances){
        Response response = new Response();
        response.setStatus(Status.SUCCESS);

        return response;
    }

}
