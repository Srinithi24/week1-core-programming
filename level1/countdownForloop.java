import java.util.Scanner;
class countdownForloop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		for(int i = num; i >= 1; i--){
			int count = i;
			System.out.println(count);
		}
		scan.close();
	}
}