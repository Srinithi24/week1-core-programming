import java.util.Scanner;
class countDown{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		while(num >= 1){
			int count = num;
			System.out.println(count);
			num -= 1;
		}
		scan.close();
	}
}