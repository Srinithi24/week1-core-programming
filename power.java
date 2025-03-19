import java.util.Scanner;
class power{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base: ");
		double base = scan.nextDouble();
		System.out.print("Enter exponent: ");
		double exponent = scan.nextDouble();
		double power = Math.pow(base, exponent);
		System.out.println("The base is "+base+" and exponent "+exponent+" and the power is "+power);
		scan.close();
	}
}