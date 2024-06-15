import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movers;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        movers = new ArrayList<Mover>();
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Bouncer bouncer = new Bouncer(100, 170, box);
        bouncer.setMovementVector(3, 1);
        StraightMover straightMover = new StraightMover(100, 123, box);
        straightMover.setMovementVector(2, 7);
        movers.add(bouncer);
        movers.add(straightMover);

        MyShape shape = new MyShape(40, 40, Color.PINK);
        bouncer = new Bouncer(0, 0, shape);
        bouncer.setMovementVector(-2, -2);
        straightMover = new StraightMover(300, 300, shape);
        straightMover.setMovementVector(-2, -3);
        movers.add(bouncer);
        movers.add(straightMover);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover mover : movers) {
            mover.draw(surface);
        }
    }
}
