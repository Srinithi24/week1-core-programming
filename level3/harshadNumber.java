import java.util.Scanner;
class harshadNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int originalNumber = num;
		int val = 0;
		int ans = 0;
		while(num > 0){
			ans = num%10;
			val += ans;
			num = num/10;
		}
		if(originalNumber % val == 0){
			System.out.println(originalNumber+" is a Harshad number");
		}
		else{
			System.out.println(originalNumber+" is not a Harshad number");
		}
		
		scan.close();
	}
}