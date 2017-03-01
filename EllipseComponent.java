import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.util.*;

public class EllipseComponent extends JComponent{
    int x,y,w,h;
    public EllipseComponent(){
        
        Random gen = new Random();
        
        this.x=gen.nextInt(700) + 1;
        this.y=gen.nextInt(700) + 1;
        this.w=gen.nextInt(100) + 1;
        this.h=gen.nextInt(100) + 1;
        Ellipse2D.Double circle = new Ellipse2D.Double(x,y,w,h);
    }
    
    /*
    public void setPos(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public void setSop(int w, int h){
        this.height=h;
        this.width=w;
    }
    */
    
     public void paintComponent (Graphics g)
    {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        //Draw the head
        for(int x = 0; x < 10; x++){
        Ellipse2D.Double head = new Ellipse2D.Double(x,y,w,h);
        g2.draw(head);
        g2.setColor(Color.BLUE);
        g2.fill(head);
       }
    }
}