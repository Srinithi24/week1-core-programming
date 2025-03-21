import java.util.Scanner;
class abundantNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 1; i< num; i++){
			if(num%i == 0){
				sum += i;
			}
		}
		if(sum > num){
			System.out.println(num+" is an abundant number");
		}
		else{
			System.out.println(num+" is not an abundant number");
		}
		
		scan.close();
	}
}