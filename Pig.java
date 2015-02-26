import java.awt.Color;

public class Pig extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a pig in the middle of it
   * @param display the model display
   */
  public Pig(World wref)
  {
    super(wref);
    Color shellColor = new Color(255, 105, 180); //requires import line at top to work (new color defined using RGB values)
    this.setShellColor(shellColor);
    
     Color bodyColor = new Color(255, 105, 180); //requires import line at top to work (new color defined using RGB values)
    this.setBodyColor(bodyColor);
    
    this.setWidth(15);
    this.setHeight(20);
    
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Pig(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}