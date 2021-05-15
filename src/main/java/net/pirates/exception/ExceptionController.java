package net.pirates.exception;

import net.pirates.DTOs.ResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static net.pirates.DTOs.ResponseDTO.FailStatus;

//@RestController
@ControllerAdvice
public class ExceptionController {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);


    @ExceptionHandler(ElementNotFoundException.class)
    public ResponseDTO fail(ElementNotFoundException exception) {
        return FailStatus();
    }

}
