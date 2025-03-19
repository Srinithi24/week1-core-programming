import java.util.Scanner;
class average{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		double num1 = scan.nextDouble();
		System.out.print("Enter number 2: ");
		double num2 = scan.nextDouble();
		System.out.print("Enter number 3: ");
		double num3 = scan.nextDouble();
		double avg = (num1 + num2 + num3)/3;
		System.out.println("The average of "+num1+", "+num2+" and "+num3+" is "+avg);
		scan.close();
	}
}