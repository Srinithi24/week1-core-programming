import java.util.Scanner;
class calculator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of operations to be done: ");
		int number = scan.nextInt();
		for(int i=1; i<=number;i++){
			System.out.print("Enter the first number: ");
			int first = scan.nextInt();
			System.out.print("Enter the second number: ");
			int second = scan.nextInt();
			System.out.print("Enter the operator it should be (+, -, * and /): ");
			String op = scan.next();
			switch(op){
			case "+":
				System.out.println("Addition: "+ (first + second));
				break;
			case "-":
				System.out.println("Subtraction: "+ (first - second));
				break;
			case "*":
				System.out.println("Multiplication: "+ (first * second));
				break;
			case "/":
				System.out.println("Division: "+ (first / second));
				break;
			default:
				System.out.println("Invalid operator");
				break;
			
			}
		}
		
		scan.close();
	}
}