package collinearity;

import net.jcip.annotations.Immutable;

@Immutable
public final class Point {
	private static final String SEPARATOR = " ";

	private final int x;
	private final int y;

	private Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	public static Point point(final int x, final int y) {
		return new Point(x, y);
	}
	
	public static Point valueOf(String serialized) {
		final String[] parts = serialized.split(SEPARATOR);
		int x = Integer.parseInt(parts[0]);
		int y = Integer.parseInt(parts[1]);
		return point(x, y);
	}
	
	public int getX() {
		return x;		
	}
	
	public int getY() {
		return y;		
	}

	/**
	 * test whether *All* coordinates of *this* are greater or equal than those of our parameters.
	 */
	public boolean greaterThan(final Point coordinates) {
		return x >= coordinates.x
				&& y >= coordinates.y;
	}
	
	@Override
	public String toString() {
		return x + SEPARATOR + y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) { return false; }
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		return (x * prime) ^ y;
	}	

}
