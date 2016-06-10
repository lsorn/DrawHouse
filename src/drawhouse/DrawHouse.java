package drawhouse;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
public class DrawHouse extends JFrame{
    public DrawHouse(){   
    }
    public static void main(String[] args) {
        DrawHouse frame = new DrawHouse();
        frame.setTitle("Draw House");
        frame.setLocation(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        Panel a = new Panel();
        frame.add(a);
        }  
    }//end of main   
class Panel extends JPanel{
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //body part
        g.setColor(Color.black);
        g.fillRect(50, 170, 300, 170);
        g.setColor(Color.yellow);
        g.fillRect(70, 170, 260, 150);
        g.setColor(Color.black);
        g.fillRect(200, 200, 100, 140);
        g.setColor(Color.yellow);
        g.fillRect(220, 220, 60, 100);
        //roofing part 
        g.setColor(Color.black);
        g.fillRect(100, 50, 50, 67);
        g.setColor(Color.yellow);
        g.fillRect(110, 60, 30, 47);
        g.setColor(Color.black);
        int[] x = {25,200,375};
        int[] y = {170,50, 170};
        g.fillPolygon(x,y,3); 
       
        
    } 
}//end of panel class

