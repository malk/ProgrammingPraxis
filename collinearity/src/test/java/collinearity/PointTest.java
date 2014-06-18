package collinearity;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;


public class PointTest {
	@Test
	public void testPoint() {
		Point point = Point.point(0, 0);
		
		assertThat(point.getX()).isEqualTo(0);
		assertThat(point.getY()).isEqualTo(0);
		
		
	}
}
