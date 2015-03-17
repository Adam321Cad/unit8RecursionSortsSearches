import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Write a description of class drawRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class drawRect
{
    /** description of instance variable x (add comment for each instance variable) */
    private double x;
    private double y;
    private double h;
    private double w;

    /**
     * Default constructor for objects of class drawRectangle
     */
    public drawRect(double x,double y, double h, double w)
    {
        // initialise instance variables
        this.x = x;
        this.y=y;
        this.h=h;
        this.w=w;
    }

    
    
    public void draw(Graphics2D g2){
        Rectangle2D.Double body = new Rectangle2D.Double(x, y, h, w);
        
        
    }
    

}
