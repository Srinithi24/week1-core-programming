import java.util.Scanner;
class greatestFactor{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int greatestFactor = 1;
		for(int i = num-1; i >= 1; i--){
			if(num % i == 0){
				greatestFactor = i;
				
				break;
			}
		}
		System.out.println("Greatest Factor: "+greatestFactor);
		scan.close();
	}
}