import java.util.Scanner;
class swapping{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int number1 = scan.nextInt();
		System.out.print("Enter number2: ");
		int number2 = scan.nextInt();
		int number3 = number1;
		number1 = number2;
		number2 = number3;
		System.out.println("The swapped numbers are "+number1+" and "+number2);
		scan.close();
	}
}