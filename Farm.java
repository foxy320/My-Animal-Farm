public class Farm
{
  public static void main(String[] a)
  {
    World wref = new World();
    Pig ex1 = new Pig(wref);
    Frog ex2 = new Frog(wref);
    
    ex2.penUp();
    ex2.forward(50);
    ex2.turnRight();
    
    ex1.animate(8);
    ex1.turnRight();
    ex1.animate(5);
    ex1.turnLeft();
    ex1.animate(3);
    ex1.turnLeft();
    ex1.animate(13);
    ex1.turnLeft();
    ex1.animate(3);
    ex1.turnLeft();
    ex1.animate(5);
    ex1.turnRight();
    ex1.animate(8);
    ex1.turnRight();
    ex1.animate(5);
    ex1.turnLeft();
    ex1.animate(3);
    ex1.turnLeft();
    ex1.animate(13);
    ex1.turnLeft();
    ex1.animate(3);
    ex1.turnLeft();
    ex1.animate(5);
    ex1.turnRight();
    
    //ex1.animate(5);
    }
}

