package org.renderer;

public class Renderer implements IRenderer {
    public Window src;
    public Colour colour;

    public Renderer(){
        colour = new Colour(0f, 0f, 0f);
    }

    @Override
    public Window createWindow(int width, int height) {
        src = new Window(width, height);
        return src;
    }

    @Override
    public void drawPoint(Vector2 point) {
        src.updatePixel(point.x, point.y, colour);
    }

    @Override
    public void drawPoints() {

    }

    @Override
    public void drawLine() {

    }

    @Override
    public void setColour(int colour) {
    }

    @Override
    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
