import java.util.Scanner;
class factorialFor{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int fact = 1;
		for(int i = num; i >=1; i--){
			fact *= i;
		}
		System.out.println("Factorial :"+fact);
		scan.close();
	}
}