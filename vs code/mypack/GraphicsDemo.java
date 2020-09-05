import java.awt.*;
import java.awt.event.*;

class GraphicsDemo extends Frame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public GraphicsDemo() {
        //Anonymous inner class to handle window close events.
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint (Graphics g) {

        // Display string onto the window
        g.drawString("I am a string.", 500, 500);
        // Draw Lines
        g.drawLine(20, 40, 100, 90);
        g.drawLine(20, 90, 100, 40);
        g.drawLine(40, 45, 250, 80);

        // Drwa rectangles 
        g.drawRect(20, 150, 60, 50);
        g.fillRect(110, 150, 60, 50);
    }
    public static void main(String[] args) {
       GraphicsDemo appwin = new GraphicsDemo();

       appwin.setSize(new Dimension(1000, 700));
       appwin.setTitle("GraphicsDemo");
       appwin.setBackground(Color.white);
       appwin.setForeground(Color.cyan);
       appwin.setTitle("New Title");
       appwin.setVisible(true);
    }    
}