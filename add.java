import java.util.Scanner;
class add{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = scan.nextInt();
		System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
		scan.close();
	}
}