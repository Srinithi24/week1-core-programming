import java.util.Scanner;
class armstrongNum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int sum = 0;
		int originalNumber = num;
		int res = 0;
		while(num != 0){
			res = num % 10;
			sum += (Math.pow(res,3));
			num = num/10;
		}
		if(sum == originalNumber){
			System.out.println(originalNumber+" is an armstrong Number");
		}
		else{
			System.out.println(originalNumber+" is not an armstrong Number");
		}
		
		scan.close();
	}
}