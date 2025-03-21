import java.util.Scanner;
class divisible{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		if(num%5 == 0){
			System.out.println("Is the number "+num+" divisible by 5? Yes");
		}
		else{
			System.out.println("Is the number "+num+" divisible by 5? No");
		}
		scan.close();
	}
}