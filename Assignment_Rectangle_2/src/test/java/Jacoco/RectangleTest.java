package Jacoco;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import rectangle.rect;

public class RectangleTest {
	@Test
	public void testarea() {
		rect r = new rect();
		assertEquals(20, r.reactanglearea(4, 5));
	}
	
	@Test
	public void testperimeter() {
		rect r = new rect();
		assertEquals(18,r.rectangleperimeter(4, 5));
	}
}
