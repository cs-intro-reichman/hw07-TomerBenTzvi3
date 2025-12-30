/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		double height = Math.sqrt(3) / 2;
		sierpinski(n, 0.0, 1.0 ,0.5, 0.0, 0.0, height);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		double[] x = {x1, x2, x3};
		double[] y = {y1, y2, y3};
		StdDraw.polygon(x, y);
		if (n == 0) return;
		double x12 = (x1 + x2) / 2;
		double y12 = (y1 + y2) / 2;
		double x23 = (x2 + x3) / 2;
		double y23 = (y2 + y3) / 2;
		double x13 = (x1 + x3) / 2;
		double y13 = (y1 + y3) / 2;
		sierpinski(n - 1, x1, x12, x13, y1, y12, y13);
		sierpinski(n - 1, x2, x23, x12, y2, y23, y12);
		sierpinski(n - 1, x3, x23, x13, y3, y23, y13);
	}
}
