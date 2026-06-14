package org.renderer;

public interface IRenderer {
    Window createWindow(int width, int height);
    void drawPoint(Vector2 point);
    void drawPoints();
    void drawLine();
    void setColour(int colour);
    void setColour(Colour colour);
}
