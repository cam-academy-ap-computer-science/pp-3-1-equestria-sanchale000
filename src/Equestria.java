
public class Equestria {

	public static void main(String[] args) {
		distance(31, 35, 15, 9);
		distance(6, 24, 20, 7);
		distance(28, 16, 22, 13);
	
	}
	public static double distance(double xOne, double xTwo, double yOne, double yTwo) {
		double d = Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
		System.out.println("The distance is " + d);
				return d;
	}

}
