import java.util.Scanner;
class areaOfCircle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double pi = Math.PI;
		System.out.print("Enter radius: ");
		int radius = scan.nextInt();
		double area = pi * (Math.pow(radius,2));
		System.out.println("Area of circle with radius "+radius+" is "+area);
		scan.close();
	}
}