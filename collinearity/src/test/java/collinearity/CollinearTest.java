package collinearity;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;


public class CollinearTest {
	@Test
	public void testSinglePoint() {
		Point point = Point.point(0, 0);
		assertThat(Collinear.isCollinear(point, point, point)).isFalse();
	}
	
	@Test
	public void testTwoPoints() {
		Point a = Point.point(0, 0);
		Point b = Point.point(1, 1);
		assertThat(Collinear.isCollinear(a, a, b)).isTrue();
		assertThat(Collinear.isCollinear(a, b, a)).isTrue();
		assertThat(Collinear.isCollinear(b, a, a)).isTrue();
	}
	
	@Test
	public void testNotLine() {
		Point a = Point.point(0, 0);
		Point b = Point.point(1, 1);
		Point c = Point.point(1, 0);
		assertThat(Collinear.isCollinear(a, b, c)).isFalse();
	}
	
	@Test
	public void testVerticalLine() {
		Point a = Point.point(0, 0);
		Point b = Point.point(0, 1);
		Point c = Point.point(0, 4);
		assertThat(Collinear.isCollinear(a, b, c)).isTrue();
	}
	
	@Test
	public void testHorizontalLine() {
		Point a = Point.point(0, 0);
		Point b = Point.point(1, 0);
		Point c = Point.point(4, 0);
		assertThat(Collinear.isCollinear(a, b, c)).isTrue();
	}
	
	@Test
	public void testLinear() {
		Point a = Point.point(1, 3);
		Point b = Point.point(4, 6);
		Point c = Point.point(10, 12);
		assertThat(Collinear.isCollinear(a, b, c)).isTrue();
	}
}
