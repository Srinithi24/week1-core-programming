import java.util.Scanner;
class sumOfNaturalNum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int formulaSum = num * (num+1)/2;
		int sum = 0;
		while(num >= 1){
			sum+= num;
			num -=1;
		}
		if(sum == formulaSum){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	scan.close();
	}
}