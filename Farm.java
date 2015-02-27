public class Farm
{
  public static void main(String[] a)
  {
    World wref = new World();
    Pig ex1 = new Pig(wref);
    Frog ex2 = new Frog(wref);
    System.out.println(ex1.getWidth());
    ex1.setWidth(ex1.getWidth() + 5);
    System.out.println(ex1.getWidth());
  }
}