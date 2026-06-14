package org.renderer;

public interface IRenderer3D extends IRenderer{
    void drawSphereFromScreen(Vector2 screenSphereCentre, float width, float height);
    void drawSphereFromWorld(Vector3 worldSphereCentre, float radius);

    void drawSquare(Vector2 screenTopLeft, float width, float height);
    void drawSquare(Vector3 worldTopLeft, float width, float height, Vector3 lookAt);

    void getScreenCoordinates();
}
