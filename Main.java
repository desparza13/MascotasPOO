import java.awt.geom.AffineTransform;
import javax.imageio.ImageIO;
import java.net.URL;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import Animals.*;

@SuppressWarnings("serial")
public class Main extends JPanel{
    public static final int CANVAS_WIDTH = 640;
    public static final int CANVAS_HEIGHT = 480;
    public static final String TITLE = "Image Transform Demo";
  
    // Image
    private String imgFileName = "Assets/pou.jpg"; // relative to project root or bin
    private Image img;
    private int imgWidth, imgHeight;    // width and height of the image
    private double x = 100.0, y = 80.0; // center (x, y), with initial value
  
    /** Constructor to set up the GUI components */
    public Main() {
       // URL can read from disk file and JAR file
       URL url = getClass().getClassLoader().getResource(imgFileName);
       if (url == null) {
          System.err.println("Couldn't find file: " + imgFileName);
       } else {
          try {
             img = ImageIO.read(url);
             this.imgWidth = img.getWidth(this);
             this.imgHeight = img.getHeight(this);
          } catch (IOException ex) {
             ex.printStackTrace();
          }
       }

       this.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);    // paint background
        setBackground(Color.WHITE);
    
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, 0, 0, this);  // Display with top-left corner at (0, 0)
    
        // drawImage() does not use the current transform of the Graphics2D context
        // Need to create a AffineTransform and pass into drawImage()
        AffineTransform transform = new AffineTransform();  // identity transform
        g2d.drawImage(img, transform, this);
        // Try applying more transform to this image
    }
    

    public static void main(String[] args) {
        // Run the GUI codes on the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               Animal pet = new Animal("Pou", "Undfined");
               JFrame frame = new JFrame(TITLE);
               JLabel FunnyPercentageLabel = new JLabel("Funny: "+pet.getFunnyPercentage()+" %", JLabel.CENTER);
               JLabel hungerPercentageLabel = new JLabel("Hunger: "+pet.getHungerPercentage()+" %", JLabel.CENTER);
               JLabel energyPercentageLabel = new JLabel("Energy: "+pet.getEnergyPercentage()+" %", JLabel.CENTER);
               JLabel sicknessPercentageLabel = new JLabel("Sickness: "+pet.getSicknessPercentage()+" %", JLabel.CENTER);
               JLabel lifetimePercentageLabel = new JLabel("Lifetime: "+pet.getLifetimePercentage()+" %", JLabel.CENTER);
               frame.setContentPane(new Main());
               frame.setLayout(null);
               frame.pack();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setLocationRelativeTo(null); // center the application window
               frame.setVisible(true);
               frame.add(FunnyPercentageLabel);
               frame.add(hungerPercentageLabel);
               frame.add(energyPercentageLabel);
               frame.add(sicknessPercentageLabel);
               frame.add(lifetimePercentageLabel);
               FunnyPercentageLabel.setBounds(350, 50, 100, 15);
               hungerPercentageLabel.setBounds(350, 70, 100, 15);
               energyPercentageLabel.setBounds(350, 90, 100, 15);
               sicknessPercentageLabel.setBounds(350, 110, 100, 15);
               lifetimePercentageLabel.setBounds(350, 140, 100, 15);
           }
        });
     }
}
