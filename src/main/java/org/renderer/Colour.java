package org.renderer;

import org.renderer.exceptions.InvalidColourIntensityException;

//RGBA - order
public class Colour {
    private float r;
    private float g;
    private float b;
    private float a;

    public Colour(float r, float g, float b, float a){
        setColour(r, g, b, a);
    }

    public Colour(float r, float g, float b){
        setColour(r, g, b);
    }

    public float getRed() { return r; }
    public float getGreen() { return g; }
    public float getBlue() { return b; }
    public float getAlpha() { return a; }

    public void setR(float intensity) throws InvalidColourIntensityException {
        validateProperty(intensity);
        this.r = intensity;
    }

    public void setG(float intensity) throws InvalidColourIntensityException {
        validateProperty(intensity);
        this.g = intensity;
    }

    public void setB(float intensity) throws InvalidColourIntensityException {
        validateProperty(intensity);
        this.b = intensity;
    }

    public void setA(float intensity) throws InvalidColourIntensityException {
        validateProperty(intensity);
        this.a = intensity;
    }

    public void validateProperty(float intensity) throws InvalidColourIntensityException{
        if (intensity < 0f || intensity > 1f)
            throw new InvalidColourIntensityException();
    }

    public void setColour(float r, float g, float b, float a){
        setR(r);
        setG(g);
        setB(b);
        setA(a);
    }

    public void setColour(float r, float g, float b){
        setR(r);
        setG(g);
        setB(b);
        setA(1f);
    }

    public void add(Colour c1){
        setR(r + c1.r);
        setG(g + c1.g);
        setB(b + c1.b);
        setA(Math.max(a, c1.a));
    }

    @Override
    public String toString() {
        return String.format("R: %.2f, G: %.2f, B: %.2f, A: %.2f", r, g, b, a);
    }

    public boolean equals(Colour c1){
        return (this.r == c1.r && this.g == c1.g && this.b == c1.b && this.a == c1.a);
    }

    public int colourToInt(){
        return (propertyToInt(r) << 24 |
                propertyToInt(g) << 16 |
                propertyToInt(b) << 8 |
                propertyToInt(a));
    }

    private int propertyToInt(float r){
        return (int) (r * 255f);
    }
}
