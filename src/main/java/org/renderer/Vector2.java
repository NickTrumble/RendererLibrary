package org.renderer;

public class Vector2 {
    public int x;
    public int y;
    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void add(Vector2 v1) {
        this.x += v1.x;
        this.y += v1.y;
    }
}
