import java.awt.Color;

public class Farm
{
  public static void main(String[] a)
  {
    World wref = new World();
    Pig ex1 = new Pig(0,0, wref);
    {
    Color shellColor = new Color(255, 105, 180); //requires import line at top to work (new color defined using RGB values)
    ex1.setShellColor(shellColor);
    
    Color bodyColor = new Color(255, 105, 180); //requires import line at top to work (new color defined using RGB values)
    ex1.setBodyColor(bodyColor);
    
    ex1.setWidth(50);
    ex1.setHeight(40);
    
    ex1.getDistance(10,10);
    ex1.getDistance(25,25);}
    
    
    ex1.getXPos(15);
    ex1.getYPos(10);
    
    ex1.penDown(5);
    ex1.turnLeft(20);
    ex1. penUp(40);
    
    
     
    
    }
    
}
}
