import javax.swing.JFrame;


public class RectangleViewer
{
    final static int ANIMATION_TIME_IN_SECONDS = 60;
    
   public static void main(String[] args)throws InterruptedException
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Two rectangles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      RectangleComponent component = new RectangleComponent();
      frame.add(component);

      frame.setVisible(true);

      RectangleComponent retec2 = new RectangleComponent(50,50,50,30);
      frame.add(retec2);
      
      frame.setVisible(true);
      
      
      
      FaceComponent comp = new FaceComponent();
      frame.add(comp);
      
      frame.setVisible(true);
      
      for (int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++)
      {
          component.nextFrame();
          Thread.sleep( 1000 );
        }
   }
}
