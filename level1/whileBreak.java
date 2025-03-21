import java.util.Scanner;
class whileBreak{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true){
			System.out.print("Enter the number: ");
			int num = scan.nextInt();
			if(num <=0){
				break;
			}
			sum+= num;
		}
		System.out.println("Sum: "+sum);
		scan.close();
	}
}