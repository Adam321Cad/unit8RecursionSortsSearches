import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class Babynames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyNames
{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String name = in.next();
        Scaner scan = null;
        ArrayList<String> rank = new ArrayList<String>();
        File decade = new File("babyNames70.txt");
        scan = new Scanner(Decade);
        
        while (scan.hasNextLine()){
            String value = scan.NextLine(); 
        }
        
    }
}
