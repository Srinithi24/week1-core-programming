import java.util.Scanner;
class multiplesWhileLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int counter = num-1;
		if(num > 0 && num < 100){
			while(counter >= 1){
				if(num%counter == 0){
					System.out.println(counter);
				}
				counter -= 1;
			}
		}
		scan.close();
	}
}