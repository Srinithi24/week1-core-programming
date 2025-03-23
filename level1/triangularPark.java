import java.util.Scanner;
class triangularPark{
	public static int park(double side1, double side2, double side3){
		double perimeter = side1 + side2 + side3;
		double distance = 5000;
		int rounds = (int)(perimeter/distance);
		return rounds;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter side1 in meters: ");
		double side1 = scan.nextDouble();
		System.out.print("Enter side2 in meters: ");
		double side2 = scan.nextDouble();
		System.out.print("Enter side3 in meters: ");
		double side3 = scan.nextDouble();
		int res = park(side1, side2, side3);
		System.out.println("The total number of rounds the athlete will run is "+res+" to complete 5 km");
		scan.close();
	}
}