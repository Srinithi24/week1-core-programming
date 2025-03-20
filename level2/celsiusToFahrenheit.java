import java.util.Scanner;
class celsiusToFahrenheit{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter temperature in Celcius: ");
		float celcius = scan.nextFloat();
		float fahrenheit = (int)(celcius * 9.0/5) + 32;
		System.out.println("The "+celcius+" celsius is "+fahrenheit+" fahrenheit");
		scan.close();
	}
}