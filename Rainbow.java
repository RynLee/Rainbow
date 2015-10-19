// Chapter 5 Question 27

// ________________________________________________
//Ryan
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JApplet;
public class Rainbow extends JPanel
{
  // Declare skyColor:
	
	private Color skyColor;
	
  public Rainbow()
  {
	skyColor=Color.CYAN;
    setBackground(skyColor);
  }
//jerrt was here
  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
int xCenter = 1/2*width;
int yCenter = 3/4*height;
int largeRadius=1/4*width;
    // ________________________________________________
 
    // Declare and initialize the radius of the large semicircle:
    // ________________________________________________

    g.setColor(Color.RED);

    // Draw the large semicircle:
     g.fillArc(xCenter, yCenter, width, height, 0, 180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    int smallRadius =  1/4*height;
    int math.sqrt(x);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
