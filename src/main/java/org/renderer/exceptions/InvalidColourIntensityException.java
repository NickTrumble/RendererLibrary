package org.renderer.exceptions;

public class InvalidColourIntensityException extends RuntimeException {
    public InvalidColourIntensityException(String message) {
        super(message);
    }
    public InvalidColourIntensityException() {
        super("Invalid Colour Intensity; Intensity of RGBA must be between 0f-1f;");
    }

}
