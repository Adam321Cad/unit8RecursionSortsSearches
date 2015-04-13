import java.awt.*;
import javax.swing.JPanel;

public class fractalTree extends JPanel
{
    //private double bla = 6;
    private double angle1 = Math.PI/9;
    //private int length = 100;
    private final int decrease =-5;
    int oldx = 500;
    int oldy = 500;
    int newx = 0;
    int newy = 0;
    int count = 0;
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
        ///g.drawLine(500,600,500,500);
        //for(int i = 0; i<10; i++){
        DrawFractal(g,700,700,100,angle1);
        //}
    }

    public void DrawFractal(Graphics g, int x, int y, int prevLength, double prevAngle){
        int length = prevLength +decrease;
        if(length <=50){
            int bifhae = 1;
            //bla++;
        }else{
            double rightAngle = prevAngle-angle1;
            double leftAngle = prevAngle+angle1;
            int rightx = x-(int)(length*Math.sin(rightAngle));
            int righty = y-(int)(length*Math.cos(rightAngle));
            int leftx = x-(int)(length*Math.sin(leftAngle));
            int lefty =y-(int)(length*Math.cos(leftAngle));
            
            if(count !=0){
                DrawFractal(g,leftx,lefty,length,leftAngle);
                g.drawLine(x,y,leftx,lefty);
            }else{count =4;}
            g.drawLine(x,y,rightx,righty);
            DrawFractal(g,rightx,righty,length,rightAngle);
            
        }
    }

//     public void angleCalc(Graphics g,double angle){
//         length = length +decrease;
//         newx = oldx-(int)(length*Math.sin(angle));
//         newy = oldy-(int)(length*Math.cos(angle));
//         g.drawLine(oldx,oldy, newx,newy);
//         oldx = newx;
//         oldy = newy;
//     }

}
