import java.awt.*;
import javax.swing.JPanel;

public class fractalTree extends JPanel
{
    private final double angle1 = Math.PI/6;
    private int length = 100;
    private final int decrease =-10;
    int oldx = 500;
    int oldy = 500;
    int newx = 0;
    int newy = 0;
    //private final int shortening;
    /** description of instance variable x (add comment for each instance variable) */

    public fractalTree()
    {
        setBackground (Color.black);
    }

    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);
        g.setColor (Color.green);
        g.drawLine(500,600,500,500);
        for(int i = 0; i<10; i++){
        angleCalc(g,angle1);
    }
    }
    
    public void angleCalc(Graphics g,double angle){
        length = length +decrease;
        newx = oldx-(int)(length*Math.sin(angle));
        newy = oldy-(int)(length*Math.cos(angle));
        g.drawLine(oldx,oldy, newx,newy);
        oldx = newx;
        oldy = newy;
    }
    
}
