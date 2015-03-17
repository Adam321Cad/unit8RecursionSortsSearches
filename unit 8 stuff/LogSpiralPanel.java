import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class LogSpiralPanel extends JPanel
{
    private static final double GOLDEN_MEAN = (1 + Math.sqrt(5)) / 2;
    //private double height
    //private double width;

    public void paintComponent(Graphics g,double x, double y, double height, double width){
        /* Your code goes here.
        1. Compute the dimensions of the goldenRectangle (you can use getHeight() 
        to obtain the side size)
        2. Draw the golden rectangle
        3. Call the recursive helper method "recursiveDraw" which will draw 
        the spiral.
         */
        Graphics2D g2 = (Graphics2D) g;
        
        double h = height;
        double w = height *GOLDEN_MEAN;
        
        drawRect d = new drawRect(x,y,h,w);
        
        d.draw(g2);
        

    }

    /**
    Method that recursively draws a logarithmic spiral.
    @param x The x-coordinate of the golden rectangle's upper-left corner  
    @param y The y-coordinate of the golden rectangle's upper-left corner
    @param side the smallest side size of the golden rectangle
    @param angle the angle (0, 90, 180 or 270) where the top of the 
    golden rectangle is located. For the outermost golden rectangle, 
    the angle is 90.
     
    private void recursiveDraw(Graphics g, double x, double y, double side, int angle)
    {
        . . .
    }

    . . .
    */
}
