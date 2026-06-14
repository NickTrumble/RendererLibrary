package org.renderer;

import org.renderer.exceptions.InvalidSizeException;

public class Window {
    private int width, height;

    private int[] pixels;
    private final int stride;

    public Window(int width, int height){
        setWidth(width);
        setHeight(height);

        stride = 4 * width;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public void setWidth(int width) throws InvalidSizeException{
        validateSize(width);
        this.width = width;
    }

    public void setHeight(int height) throws InvalidSizeException{
        validateSize(height);
        this.height = height;
    }

    private void validateSize(int size) throws InvalidSizeException{
        if (size < 1)
            throw new InvalidSizeException(size);
    }

    public void udpatePixel(int x, int y, Colour c){
        pixels[y * stride + x] = c.colourToInt();
    }

    private int getPixel(int x, int y){ return pixels[y * stride + x]; }
}
