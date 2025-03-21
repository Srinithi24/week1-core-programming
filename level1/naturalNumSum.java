import java.util.Scanner;
class naturalNumSum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		if(num < 0){
			System.out.println("The number "+num+" is not a natural number");
		}
		else{
			int sum = (num*(num+1))/2;
			System.out.println("The sum of "+num+" natural numbers is "+sum);
		}
		scan.close();
	}
}