import java.util.Scanner;
class quotientRemainder{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = scan.nextInt();
		int quotient = num1/num2;
		int remainder = num1%num2;
		System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+num1+" and "+num2);
		scan.close();
	}
}