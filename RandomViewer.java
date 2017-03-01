
import javax.swing.JFrame;
import java.util.Random;

public class RandomViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(1000, 1000);
      frame.setTitle("A bunch of Circles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      Random gen = new Random();

      
      for (int i = 1; i <= 10; i++) {
          //int r = gen.nextInt(30)+20;
          //int x = gen.nextInt(200);
          // int y = gen.nextInt(200);
          EllipseComponent component = new EllipseComponent();
          frame.add(component);
          
          frame.setVisible(true);
          
          
      }
   }
}
