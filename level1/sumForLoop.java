import java.util.Scanner;
class sumForLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i = num; i >= 1; i--){
			sum += i;
		}
		System.out.println("Sum: "+sum);
		int formulaSum = num * (num+1)/2;
		if(sum == formulaSum){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		scan.close();
	}
}