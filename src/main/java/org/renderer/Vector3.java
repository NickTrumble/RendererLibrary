package org.renderer;

public class Vector3 {
    public int x;
    public int y;
    public int z;
    public Vector3(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void add(Vector3 v1) {
        this.x += v1.x;
        this.y += v1.y;
        this.z += v1.z;
    }
}



