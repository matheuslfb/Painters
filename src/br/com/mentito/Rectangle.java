package br.com.mentito;


public class Rectangle
{
    private static final boolean OVERLAPED = true;

    private int x1;
    private int y1;

    private int x2;
    private int y2;

    private Boolean block[][];

    public Rectangle(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        this.block = new Boolean[this.width()][this.height()];
    }

    public void overlap(Rectangle rectangle)
    {
        if (rectangle.x1 > this.x2 || rectangle.y1 > this.y2) {
            return;
        }

        for (int i = 0; i < this.width(); i++) {
            for (int j = 0; j < this.height(); j++) {
                //TODO
                this.block[i][j] = OVERLAPED;
            }
        }
    }

    public Integer width()
    {
        return x2 - x1;
    }

    public Integer height()
    {
        return y2 - y1;
    }

    public String toString()
    {
        return "(" + x1 + ", " + y1 + ")" + "(" + x2 + ", " + y2 + ")";
    }
}
