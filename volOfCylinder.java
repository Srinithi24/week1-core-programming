import java.util.Scanner;
class volOfCylinder{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double pi = Math.PI;
		System.out.print("Enter radius: ");
		double radius = scan.nextDouble();
		System.out.print("Enter height: ");
		double height = scan.nextDouble();
		double volume = pi * (Math.pow(radius,2)) * height;
		System.out.println("Volume of Cylinder with radius "+radius+" and height "+height+" is "+volume);
		scan.close();
	}
}