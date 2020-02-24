package Ch10.Rect;

/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    private int h;
    private int w;
    
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle();
        System.out.println("Creating new Rect with: " + rect1);
        Rectangle rect2 = new Rectangle(5);
        System.out.println("Creating new Rect with: " + rect2);
        Rectangle rect3 = new Rectangle(7, 5);
        System.out.println("Creating new Rect with: " + rect3);
        
        System.out.println();
        
        System.out.println("Is rect1 a rectangle?: " + rect1.isSquare());
        System.out.println("Is rect2 a rectangle?: " + rect2.isSquare());
        System.out.println("Is rect3 a rectangle?: " + rect3.isSquare());
        
        System.out.println();
        
        System.out.println("Quadratizing rect3...");
        rect3.quadratize();
        System.out.println("rect3 is now: " + rect3);
        
        
    }
    
    public Rectangle()
    {
        this.h = 1;
        this.w = 1;
    }
    
    public Rectangle(int a)
    {
        if(a > 0)
        {
            this.h = a;
            this.w = a;
        }
        else
            throw new IllegalArgumentException("Square is not a positive" + 
                                                "Integer.");
    }
    
    public Rectangle(int h, int w)
    {
        if(h > 0 && w > 0)
        {
            this.h = h;
            this.w = w;
        }
        else
        {
            throw new IllegalArgumentException("Rectangle is not a positive" + 
                                                "Integer.");
        }
    }
    
    public boolean isSquare()
    {
        return this.h == this.w;
    }
    
    public void quadratize()
    {
        int count = 1;
        int rectArea = this.h * this.w;
        for(int square = 2; (int)Math.pow(square, count) < rectArea; count++) 
        {}
        this.h = count;
        this.w = count;
    }
    
    public String toString()
    {
        return "\n" + "Height: " + this.h + "\n" 
               + "Width: " + this.w;
    }
}
