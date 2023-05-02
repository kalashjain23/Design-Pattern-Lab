import java.util.*;

interface Shape
{
    void draw();
}

class Circle implements Shape
{
    private int x, y;
    private String color;

    Circle(String color)
    {
        this.color = color;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y) 
    {
        this.y = y;
    }

    public void draw()
    {
        System.out.println("Drawing a circle at x: " + this.x + " and y: " + this.y + "\n");
    }
}

class ShapeMaker
{
    static HashMap circleMap = new HashMap();

    public static Circle getCircle(String color)
    {
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a circle of color: " + color);
        }

        return circle;
    }
}

public class FlyWeight {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
   public static void main(String[] args) {

      for(int i=0; i < 20; ++i) {
         Circle circle = (Circle)ShapeMaker.getCircle(getRandomColor());
         circle.setX(getRandomX());
         circle.setY(getRandomY());
         circle.draw();
      }
   }
   private static String getRandomColor() {
      return colors[(int)(Math.random()*colors.length)];
   }
   private static int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private static int getRandomY() {
      return (int)(Math.random()*100);
   }
}
