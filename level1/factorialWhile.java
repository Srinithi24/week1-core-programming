import java.util.Scanner;
class factorialWhile{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int fact = 1;
		while(num >= 1){
			fact *= num;
			num -= 1;
		}
		System.out.println("Factorial :"+fact);
		scan.close();
	}
}