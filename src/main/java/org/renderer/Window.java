package org.renderer;

import org.renderer.exceptions.InvalidSizeException;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Window {
    private int width, height;
    private int[] pixels;
    private final int stride;

    private BufferedImage image;
    private JFrame frame;
    private JPanel panel;

    public Window(int width, int height){
        setWidth(width);
        setHeight(height);

        stride = width;
        pixels = new int[stride * height];

        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };

        frame = new JFrame("Renderer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(width, height);

        frame.setVisible(true);


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

    public void updatePixel(int x, int y, Colour c){
        pixels[y * stride + x] = c.colourToInt();
    }

    public int getPixel(int x, int y){ return pixels[y * stride + x]; }

    public void render(){
        image.setRGB(0, 0, width, height, pixels, 0, stride);
        panel.repaint();
    }
}
