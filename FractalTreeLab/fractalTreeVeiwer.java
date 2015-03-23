import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fractalTreeVeiwer{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(1200, 800);
        frame.setTitle("fractalTree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fractalTree bla = new fractalTree();
        frame.add(bla);
        frame.setVisible(true);
    }
}