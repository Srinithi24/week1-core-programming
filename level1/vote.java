import java.util.Scanner;
class vote{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = scan.nextInt();
		if(age < 18){
			System.out.println("The person's age is "+age+" and cannot vote.");
		}
		else{
			System.out.println("The person's age is "+age+" and can vote.");
		}
		scan.close();
	}
}