import java.util.Scanner;
class kmToMiles{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter distance in kilometers: ");
		double km = scan.nextDouble();
		double miles = km * 0.621371;
		System.out.println("The distance in kilometers is "+km+" is coverted to miles as "+miles+" miles.");
		scan.close();
	}
}