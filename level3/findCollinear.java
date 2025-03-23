import java.util.Scanner;
public class findCollinear{
	public static boolean slope(double x1, double y1, double x2, double y2, double x3, double y3){
		double[] slope = new double[3];
		slope[0] =  (y2 - y1)/(x2 - x1);
		slope[1] = (y3 - y2)/(x3 - x2);
		slope[2] = (y3 - y1)/(x3 - x1);
		if(slope[0] == slope[1] && slope[1] == slope[2]){
			return true;
		}return false;
	}
	public static boolean area(double x1, double y1, double x2, double y2, double x3, double y3){
		double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		return area ==0;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("x1 and y1: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("x2 and y2: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
		System.out.println("x3 and y3: ");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
		System.out.println("Collinear using slope formula? "+slope(x1, y1,x2,y2,x3, y3));
		System.out.println("Collinear using area of triangle formula? "+area(x1, y1,x2,y2,x3, y3));
		scan.close();
	}
}