
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;


public class cat extends JFrame {

    public static void main(String[] args) {
        final cat app = new cat();
// show what we've done
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() {
                app.setVisible(true);
            }
        }
        );
    }

    public cat() {
//set the JFrame title
        super("Julia <3");
//kill the process when the JFrame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//only three JOGL lines of code ... and here they are
        GLCapabilities glcaps = new GLCapabilities();
        GLCanvas glcanvas = new GLCanvas(glcaps);
        glcanvas.addGLEventListener(
                new catListener()
        );
//add the GLCanvas just like we would any Component
        getContentPane().add(glcanvas, BorderLayout.CENTER);
        setSize(500, 300);
//center the JFrame on the screen
        centerWindow(this);
    }

    public void centerWindow(Component frame) {
        Dimension screenSize
                = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        frame.setLocation(
                (screenSize.width - frameSize.width) >> 1,
                (screenSize.height - frameSize.height) >> 1
        );
    }
}


