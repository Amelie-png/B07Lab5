package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
    public void testPerimeter() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(4, 3);
        Point D = new Point(0, 3);
        Rectangle rect = new Rectangle(A, B, C, D);

        assertEquals(14.0, rect.perimeter(), 1e-6);
    }

    @Test
    public void testArea() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point D = new Point(0, 3);
        Rectangle rect = new Rectangle(A, B, null, D); // C unused for area()
        assertEquals(12.0, rect.area(), 1e-6);
    }

}
