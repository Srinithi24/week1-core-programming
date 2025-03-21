import java.util.Scanner;
class fizzBuzz{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		if(num <= 0){
			System.out.println("Not a positive number");
		}
		else{
			for(int i = 1; i<=num; i++){
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
			}
		}
		scan.close();
	}
}