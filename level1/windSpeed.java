import java.util.Scanner;

class windSpeed{
	public static double calculateWindChill(double temperature, double windSpeed) {
		double windChill = 35.74 + 0.6215 * temperature +(0.4275 * temperature - 35.75) * (Math.pow(windSpeed, 0.16));
		return windChill;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temperature: ");
		double temperature = scan.nextDouble();
		System.out.print("Enter the wind speed: ");
		double windSpeed = scan.nextDouble();
		double res = calculateWindChill(temperature, windSpeed);
		System.out.println("Wind Chill: "+res);
		scan.close();
	}
}