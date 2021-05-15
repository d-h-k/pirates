package net.pirates.DTOs;

enum ResponseStatus {SUCCESS, FAIL}

public class ResponseDTO {


    private final Boolean error;
    private final Integer code;
    private final String message;

    private ResponseDTO(Boolean error, Integer code, String message) {
        this.error = error;
        this.code = code;
        this.message = message;
    }

    public static ResponseDTO SuccessStatus() {
        return new ResponseDTO(false, 0, "SUCCESS");
    }

    public static ResponseDTO FailStatus() {
        return new ResponseDTO(true, 1, "FAIL");
    }

    public Boolean getError() {
        return error;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "error=" + error +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
