import java.util.Scanner;
class powerWhileLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		System.out.print("Enter the power: ");
		int power = scan.nextInt();
		int res = 1;
		int counter = 0;
		while(counter != power){
			res *= num;
			counter += 1;
		}
		System.out.println("The result is :"+res);
		scan.close();
	}
}