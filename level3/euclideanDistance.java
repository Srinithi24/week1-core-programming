import java.util.Scanner;
class euclideanDistance{
	public static double distance(double x1, double y1, double x2, double y2){
		double distance = Math.sqrt(Math.pow(x2-x1, 2)) + Math.sqrt(Math.pow(y2-y1, 2));
		return distance;
	}
	public static void equation(double x1, double y1, double x2, double y2){
		double m = (y2 - y1)/(x2 - x1);
		double b = y1 - m * x1;
		System.out.println("Slope: "+m);
		System.out.println("y- intercept: "+b);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("x1 and y1: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("x2 and y2: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
		System.out.println("The euclidiean distance: "+distance(x1, y1,x2,y2));
		equation(x1, y1,x2,y2);
		scan.close();
	}
}