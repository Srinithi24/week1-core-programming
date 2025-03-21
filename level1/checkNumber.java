import java.util.Scanner;
class checkNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scan.nextInt();
		if(number == 0){
			System.out.println("zero");
		}
		else if(number < 0){
			System.out.println("negative");
		}
		else{
			System.out.println("positive");
		}
		scan.close();
	}
}