import java.awt.Graphics;

public interface Mover {
    void draw(Graphics surface);

    void setMovementVector(int xIncrement, int yIncrement);
}
