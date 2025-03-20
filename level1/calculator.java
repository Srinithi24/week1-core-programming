import java.util.Scanner;
class calculator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the num1: ");
		float num1 = scan.nextFloat();
		System.out.print("Enter the num2: ");
		float num2 = scan.nextFloat();
		float addition = num1 + num2;
		float subraction = num1 - num2;
		float multiplication = num1 * num2;
		float division = num1 / num2;
		System.out.println("The addition, subraction, multiplication and division of the 2 numbers "+num1+" and "+num2+" is "+addition+", "+subraction+", "+multiplication+" and "+division);
		scan.close();
	}
}