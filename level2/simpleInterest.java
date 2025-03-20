import java.util.Scanner;
class simpleInterest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter principal amount: ");
		double principal = scan.nextDouble();
		System.out.print("Enter Rate of interest: ");
		double rate = scan.nextDouble();
		System.out.print("Enter time: ");
		int time = scan.nextInt();
		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
		scan.close();
	}
}