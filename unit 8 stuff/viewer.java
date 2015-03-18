import javax.swing.JFrame;

/**
 * Write a description of class viewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class viewer
{
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("LogSpiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogSpiralPanel bla = new LogSpiralPanel();
        frame.add(bla);
        frame.setVisible(true);
    }
}

