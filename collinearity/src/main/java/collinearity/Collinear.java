package collinearity;


public class Collinear {

	public static boolean isCollinear(Point a, Point b, Point c) {		
		return !allThreePointsAreTheSame(a, b, c)
				&& (
					twoOfThePointsAreTheSame(a, b, c)
					|| pointsFormHorizontalLine(a, b, c)
					|| pointsFormVerticalLine(a, b, c)
					|| pointsFormADiagonal(a, b, c));
	}

	private static boolean pointsFormADiagonal(Point a, Point b, Point c) {
		return ((a.getX() - b.getX()) == (a.getY() - b.getY()))
			&& ((c.getX() - b.getX()) == (c.getY() - b.getY()));
	}

	private static boolean pointsFormVerticalLine(Point a, Point b, Point c) {
		return a.getY() == b.getY() && b.getY() == c.getY();
	}

	private static boolean pointsFormHorizontalLine(Point a, Point b, Point c) {
		return a.getX() == b.getX() && b.getX() == c.getX();
	}

	private static boolean twoOfThePointsAreTheSame(Point a, Point b, Point c) {
		return a.equals(c) || a.equals(b) || c.equals(b);
	}

	private static boolean allThreePointsAreTheSame(Point a, Point b, Point c) {
		return a.equals(c) && c.equals(b);
	}

}
