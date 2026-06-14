package org.renderer;

public interface IRenderer2D extends IRenderer{
    void drawSquare(Vector2 topLeft, float width, float height);
    void drawCircle(Vector2 centre, float radius);
}
