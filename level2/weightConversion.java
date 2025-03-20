import java.util.Scanner;
class weightConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = scan.nextDouble();
		double kilograms = weight * 0.453;
		System.out.println("The weight of the person in pound is "+weight+" and in kg is "+kilograms);
		scan.close();
	}
}