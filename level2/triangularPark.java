import java.util.Scanner;
class triangularPark{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter side1 in meters: ");
		double side1 = scan.nextDouble();
		System.out.print("Enter side2 in meters: ");
		double side2 = scan.nextDouble();
		System.out.print("Enter side3 in meters: ");
		double side3 = scan.nextDouble();
		double perimeter = side1 + side2 + side3;
		double distance = 5000;
		int rounds = (int)(perimeter/distance);
		System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
		scan.close();
	}
}