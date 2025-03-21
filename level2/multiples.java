import java.util.Scanner;
class multiples{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		if(num > 0 && num < 100){
			for(int i = 100; i >= 1; i--){
				if(num%i == 0){
					System.out.println(i);
				}
				continue;
			}
		}
		scan.close();
	}
}