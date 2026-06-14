package org.renderer.exceptions;

public class InvalidSizeException extends RuntimeException {
    public InvalidSizeException(String message) {
        super(message);
    }
    public InvalidSizeException(int size){ super(size + " is not a valid size.");}
}
