import java.util.Scanner;

class unitConvertors{
	public static double convertFarhenheitToCelsius(double farhenheit) {
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;
	}
	public static double convertCelsiusToFarhenheit(double celsius){
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
	public static double poundsToKilograms(double pounds){
		double pounds2kilograms = pounds * 0.453592;
		return pounds2kilograms;
	}
	public static double kilogramsToPounds(double kilograms){
		double kilograms2pounds = kilograms * 2.20462; 
		return kilograms2pounds;
	}
	public static double gallonsToLiters(double gallons){
		double gallons2liters = gallons * 3.78541; 
		return gallons2liters;
	}
	public static double litersToGallons(double liters){
		double liters2gallons = liters * 0.264172; 
		return liters2gallons;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the farhenheit: ");
		double farhenheit = scan.nextDouble();
		System.out.print("Enter the celsius: ");
		double celsius = scan.nextDouble();
		System.out.print("Enter the pounds: ");
		double pounds = scan.nextDouble();
		System.out.print("Enter the kilograms: ");
		double kilograms = scan.nextDouble();
		System.out.print("Enter the gallons: ");
		double gallons = scan.nextDouble();
		System.out.print("Enter the liters: ");
		double liters = scan.nextDouble();
		
		double farhenheit2celsius = convertFarhenheitToCelsius(farhenheit);
		System.out.println(farhenheit+" F is converted to "+farhenheit2celsius+" C.");
		double celsius2farhenheit = convertCelsiusToFarhenheit(celsius);
		System.out.println(celsius+" C is converted to "+celsius2farhenheit+" F.");
		double pounds2kilograms = poundsToKilograms(pounds);
		System.out.println(pounds+" pounds is converted to "+pounds2kilograms+" kg.");
		double kilograms2pounds = kilogramsToPounds(kilograms);
		System.out.println(kilograms+" kg is converted to "+kilograms2pounds+" pounds.");
		double gallons2liters = gallonsToLiters(gallons);
		System.out.println(gallons+" gallons is converted to "+gallons2liters+" l.");
		double liters2gallons = litersToGallons(liters);
		System.out.println(liters+" l is converted to "+liters2gallons+" gallons.");
		scan.close();
	}
}