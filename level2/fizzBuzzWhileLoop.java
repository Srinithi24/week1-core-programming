import java.util.Scanner;
class fizzBuzzWhileLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int i = 1;
		if(num <= 0){
			System.out.println("Not a positive number");
		}
		else{
			while(i<=num){
				if(i % 3 == 0 && i%5 ==0){
					System.out.println("FizzBuzz");
				}
				else if(i%3 ==0){
					System.out.println("Fizz");
				}
				else if(i%5 ==0){
					System.out.println("Buzz");
				}
				else{
					System.out.println(i);
				}
				i += 1;
			}
		}
		scan.close();
	}
}