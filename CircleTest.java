package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CircleTest {

	@Test
	void testCirclePerimeter1() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(p1, 1);
		assertEquals(c1.perimeter(), Math.PI*2*1);
	}

	@Test
	void testCirclePerimeter2() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(p1, 2.5);
		assertEquals(c1.perimeter(), Math.PI*2*2.5);
	}
	
	@Test
	void testCirclePerimeter3() {
		Point p1 = new Point(100, 100);
		Circle c1 = new Circle(p1, 1);
		assertEquals(c1.perimeter(), Math.PI*2*1);
	}
	
	@Test
	void testCirclePerimeter4() {
		Point p1 = new Point(100, 100);
		Circle c1 = new Circle(p1, -2);
		assertEquals(c1.perimeter(), Math.PI*2*2);
	}
	
	@Test
	void testCirclePerimeter5() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(p1, 100);
		assertEquals(c1.perimeter(), Math.PI*2*100);
	}
	
	@Test
	void testCirclePerimeter6() {
		Point p1 = new Point(100, 100);
		Circle c1 = new Circle(p1, 100);
		assertEquals(c1.perimeter(), Math.PI*2*100);
	}
	
	@Test
	void testCircleArea1() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(p1, -100);
		assertEquals(c1.area(), Math.PI*100*100);
	}
	
	@Test
	void testCircleArea2() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(p1, 1);
		assertEquals(c1.area(), Math.PI*1);
	}
	
	@Test
	void testCircleArea3() {
		Point p1 = new Point(100, 100);
		Circle c1 = new Circle(p1, 100);
		assertEquals(c1.area(), Math.PI*100*100);
	}
	
	@Test
	void testCircleArea4() {
		Point p1 = new Point(100, 100);
		Circle c1 = new Circle(p1, 1);
		assertEquals(c1.area(), Math.PI*1);
	}
	
	@Test
	void testCircleArea5() {
		Point p1 = new Point(0, 0);
		Circle c1 = new Circle(p1, 2.5);
		assertEquals(c1.area(), Math.PI*2.5*2.5);
	}
}
