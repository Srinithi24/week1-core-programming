import java.util.Scanner;

class unitConvertor{
	public static double convertKmToMiles(double km) {
		double km2miles = km * 0.621371;
		return km2miles;
	}
	public static double convertMilesTokm(double miles){
		double miles2km = miles * 1.60934;
		return miles2km;
	}
	public static double metersToFeet(double meters){
		double meters2feet = meters * 3.28084;
		return meters2feet;
	}
	public static double feetToMeters(double feet){
		double feet2meters = feet * 0.3048;
		return feet2meters;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the kilometer: ");
		double km = scan.nextDouble();
		System.out.print("Enter the miles: ");
		double miles = scan.nextDouble();
		System.out.print("Enter the meters: ");
		double meters = scan.nextDouble();
		System.out.print("Enter the feet: ");
		double feet = scan.nextDouble();
		double km2miles = convertKmToMiles(km);
		System.out.println(km+" km is converted to "+km2miles+" miles.");
		double miles2km = convertMilesTokm(miles);
		System.out.println(miles+" miles is converted to "+miles2km+" km.");
		double meters2feet = metersToFeet(meters);
		System.out.println(meters+" meters is converted to "+meters2feet+" feet.");
		double feet2meters = feetToMeters(feet);
		System.out.println(feet+" feet is converted to "+meters2feet+" meters.");
		scan.close();
	}
}