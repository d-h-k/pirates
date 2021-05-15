package net.pirates.exception;

public class ElementNotFoundException extends RuntimeException {
    private final static String NOT_FOUND_MESSAGE = "no database existed";

    public ElementNotFoundException() {
        super(NOT_FOUND_MESSAGE);
    }
}
