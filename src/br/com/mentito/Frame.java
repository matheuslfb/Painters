package br.com.mentito;

import java.util.ArrayList;

public class Frame
{
    private Rectangle[] rectangles;
    private int amountOfRectangles;

    public Frame()
    {
        this.amountOfRectangles = 0;
        this.rectangles = new Rectangle[50000];
    }

    public void add(Rectangle rectangle)
    {
        this.rectangles[amountOfRectangles++] = rectangle;
    }

    public Rectangle getFirst()
    {
        return rectangles[0];
    }

    public int amount()
    {
        return amountOfRectangles;
    }

    public Integer calculate()
    {
        Rectangle firstRectangle = this.getFirst();

       // firstRectangle.overlap(rectangles[1]);

        return 0;
    }

    public String toString()
    {
        String result = "Frame:\n";

        for (int i = 0; i < amountOfRectangles; i++) {
            result += i + ": " + rectangles[i] + "\n";
        }

        return result;
    }
}
