import java.util.Scanner;
class smallest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = scan.nextInt();
		System.out.print("Enter number 3: ");
		int num3 = scan.nextInt();
		if(num1 < num2 && num1 < num3){
			System.out.println("Is the first number the smallest? Yes");
		}
		else{
			System.out.println("Is the first number the smallest? No");
		}
		scan.close();
	}
}