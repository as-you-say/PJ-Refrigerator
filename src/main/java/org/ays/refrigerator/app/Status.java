package org.ays.refrigerator.app;

public enum Status {
    SUCCESS(200, "성공"),
    ERROR(1000, "에러"),
    DATABASE_ERROR(1001, "DB 에러"),
    HTTP_CONFLICT(2409, "잘못된 요청"),
    ;

    private final int code;
    private final String message;

    Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
    public int getCode() {
        return this.code;
    }
}
