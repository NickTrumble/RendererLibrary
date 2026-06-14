package org.renderer;

public class Renderer implements IRenderer {
    @Override
    public Window createWindow(int width, int height) {
        return new Window(width, height);
    }

    @Override
    public void drawPoint(Vector2 point) {

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

    }
}
