import java.util.Scanner;
class sum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int sum = 0;
		while(num != 0){
			sum+= num;
			System.out.print("Enter the number: ");
			num = scan.nextInt();
		}
		System.out.println("Sum: "+sum);
		scan.close();
	}
}