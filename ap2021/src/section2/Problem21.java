package section2;

public class Problem21 {

	public static void main(String[] args) {
		Parabola par1 = new Parabola(2, -6, -5);
		double axis1 = par1.getAxis() ; //assigns 1.5 to axis1
		boolean onGraph1 = par1.isOnGraph (4, 3.0) ;//assigns true to onGraph1 
		System.out.println(axis1 + ":" + onGraph1);

		Parabola par2 = new Parabola(4, 2, -2);
		double axis2 = par2.getAxis() ; //assigns 1.5 to axis1
		boolean onGraph2 = par2.isOnGraph (4, 3.0) ;//assigns true to onGraph1 
		System.out.println(axis2 + ":" + onGraph2);
	}
}

class Parabola {
	private int a;
	private int b;
	private int c;

	public Parabola(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getAxis() {
		return (double) (-1.0 * b / (2 * a));
	}

	public boolean isOnGraph(double x, double y) {
		return (y == (double)a * x * x + b * x + c);
	}
}
