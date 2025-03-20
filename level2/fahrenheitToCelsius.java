import java.util.Scanner;
class fahrenheitToCelsius{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter temperature in fahrenheit: ");
		double fahrenheit = scan.nextDouble();
		double celsius = (fahrenheit - 32)*5.0/9;
		System.out.println("The "+fahrenheit+" fahrenheit is "+celsius+" celsius");
		scan.close();
	}
}