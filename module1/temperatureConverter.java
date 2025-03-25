import java.util.Scanner;
class temperatureConverter{
	public static double celToFahren(double celcius){
		return (celcius * 9.0/5)+32;
	}
	public static double fahrenToCel(double fahreinheit){
		return (fahreinheit - 32) / (9.0/5);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter temperature in C: ");
		double celcius = scan.nextDouble();
		System.out.print("Enter temperature in F: ");
		double fahreinheit = scan.nextDouble();
		double c = celToFahren(celcius);
		double f = fahrenToCel(fahreinheit);
		System.out.println(celcius+" C in fahreinheit is "+c+" F");
		System.out.println(fahreinheit+" F in celcius is "+f+" C");
		scan.close();
	}
}