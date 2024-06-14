import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxs;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxs = new ArrayList<BouncingBox>();
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(1, 1);
        boxs.add(box);
        
        box = new BouncingBox(50, 200, Color.BLUE);
        box.setMovementVector(-1, -2);
        boxs.add(box);

        box = new BouncingBox(40, 40, Color.GREEN);
        box.setMovementVector(-2, 0);
        boxs.add(box);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawOval(40, 40, 10, 30);
        surface.drawRect(100, 100, 30, 30);
        surface.drawRoundRect(200, 200, 50, 50, 30, 30);

        for (BouncingBox box : boxs) {
            box.draw(surface);
        }
    }
} 