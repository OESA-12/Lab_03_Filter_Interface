import java.util.ArrayList;
import java.awt.Rectangle;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(4, 2));
        rectangles.add(new Rectangle(5, 6));
        rectangles.add(new Rectangle(3, 5));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(2, 4));
        rectangles.add(new Rectangle(3, 1));
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(2, 6));
        rectangles.add(new Rectangle(5, 9));
        rectangles.add(new Rectangle(8, 7));

        // Display all rectangles
        System.out.println("All Rectangles:");
        for (Rectangle rect : rectangles) {
            System.out.println("Width: " + rect.getWidth() + ", Height: " + rect.getHeight());
        }
    }
}