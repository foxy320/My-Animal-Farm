import java.awt.Color; //needed for color to work

public class Frog extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Frog(World wref)
  {
    super(wref);
    Color shellColor = new Color(0, 100, 0); //requires import line at top to work (new color defined using RGB values)
    this.setShellColor(shellColor);
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Frog(int x, int y, World wref)
  {
    super(x, y, wref);
    Color shellColor = new Color(0, 100, 0); //requires import line at top to work (new color defined using RGB values)
    this.setShellColor(shellColor);
  }
  
}