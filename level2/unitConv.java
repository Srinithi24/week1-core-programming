import java.util.Scanner;

class unitConv{
	public static double yardsToFeet(double yards) {
		double yards2feet = yards * 3;
		return yards2feet;
	}
	public static double feetToYards(double feet){
		double feet2yards = feet * 0.333333;
		return feet2yards;
	}
	public static double metersToInches(double meters){
		double meters2inches = meters * 39.3701;
		return meters2inches;
	}
	public static double inchesToMeters(double inches){
		double inches2meters = inches * 0.0254;
		return inches2meters;
	}
	public static double inchesToCm(double inches){
		double inches2cm = inches * 2.54;
		return inches2cm;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the yards: ");
		double yards = scan.nextDouble();
		System.out.print("Enter the feet: ");
		double feet = scan.nextDouble();
		System.out.print("Enter the meters: ");
		double meters = scan.nextDouble();
		System.out.print("Enter the inches: ");
		double inches = scan.nextDouble();
		
		double yards2feet = yardsToFeet(yards);
		System.out.println(yards+" yards is converted to "+yards2feet+" feet.");
		double feet2yards = feetToYards(feet);
		System.out.println(feet+" feet is converted to "+feet2yards+" yards.");
		double meters2inches = metersToInches(meters);
		System.out.println(meters+" meters is converted to "+meters2inches+" inches.");
		double inches2meters = inchesToMeters(inches);
		System.out.println(inches+" inches is converted to "+inches2meters+" meters.");
		double inches2cm = inchesToCm(inches);
		System.out.println(inches+" inches is converted to "+inches2cm+" cm.");
		scan.close();
	}
}