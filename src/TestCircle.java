
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCircle {

    @Test
    void testConstructorr() {
        Point center = new Point(1, 2);
        Circle c = new Circle(center, 2);
        assertEquals(2, c.radius);
    }
    
    @Test
    void testConstructorc() {
        Point center = new Point(1, 2);
        Circle c = new Circle(center, 2);
        assertEquals(center, c.C);
    }
	
	@Test
    void testPerimeter() {
        Point center = new Point(0, 0);
        Circle c = new Circle(center, 2);
        assertEquals(2 * Math.PI * 2, c.perimeter());
    }

    @Test
    void testArea() {
        Point center = new Point(0, 0);
        Circle c = new Circle(center, 2);
        assertEquals(Math.PI * 4, c.area());
    }
}