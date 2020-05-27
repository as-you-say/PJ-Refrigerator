package org.ays.refrigerator.app;

import java.util.HashMap;
import java.util.Map;

public class Response {
    // HTTP 상태코드 및 메시지
    private int code;
    private String message;

    // 데이터
    private Map<String, Object> data;

    public Response () {
        data = new HashMap<>();
    }

    public void addData(String key, Object value){
        data.put(key, value);
    }

    public void setStatus(Status responseStatus){
        this.code = responseStatus.getCode();
        this.message = responseStatus.getMessage();
    }

    @Override
    public String toString() {
        return "Response Log >>> " + code + ":" + message + "";
    }
}
