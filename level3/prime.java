import java.util.Scanner;
class prime{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		if(num <= 1){
			System.out.println(num+" is not prime.");
		}
		else{
			boolean isPrime = true;
			for(int i = 2; i < num; i++){
				if(num % i ==0 ){
					isPrime = false;
					break;
				}
			}
		if(isPrime){
			System.out.println(num+" is prime");
		}
		else{
			System.out.println(num+" is not prime");
		}
		}
		scan.close();
	}
}