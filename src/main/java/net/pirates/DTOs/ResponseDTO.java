package net.pirates.DTOs;

enum ResponseStatus {SUCCESS, FAIL}

public class ResponseDTO {


    private final Boolean isError;
    private final Integer code;
    private final String message;

    private ResponseDTO(Boolean isError, Integer code, String message) {
        this.isError = isError;
        this.code = code;
        this.message = message;
    }

    public static ResponseDTO SuccessStatus() {
        return new ResponseDTO(false, 0, "SUCCESS");
    }

    public static ResponseDTO FailStatus() {
        return new ResponseDTO(true, 1, "FAIL");
    }


}
