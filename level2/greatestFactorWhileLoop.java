import java.util.Scanner;
class greatestFactorWhileLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int greatestFactor = 1;
		int counter = num -1;
		while(counter != 1){
			if(num%counter == 0){
				greatestFactor = counter;
				break;
			}
			counter -= 1;
		}
		System.out.println("Greatest Factor: "+greatestFactor);
		scan.close();
	}
}