import java.applet.Applet;
import java.awt.Graphics;

// Basic Applet demonstrating Life Cycle Methods
public class LifeCycleApplet extends Applet {

    // Called once when the applet is initialized
    @Override
    public void init() {
        System.out.println("Applet Initialized");
    }

    // Called every time the applet starts or is brought back into focus
    @Override
    public void start() {
        System.out.println("Applet Started");
    }

    // Called every time the applet is stopped or minimized
    @Override
    public void stop() {
        System.out.println("Applet Stopped");
    }

    // Called once when the applet is destroyed
    @Override
    public void destroy() {
        System.out.println("Applet Destroyed");
    }

    // Called when applet window is redrawn
    @Override
    public void paint(Graphics g) {
        g.drawString("Welcome to the Applet Life Cycle!", 20, 20);
    }
}
