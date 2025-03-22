import java.util.Scanner;
class fizzBuzz{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		String[] arr = new String[num];
		if(num <= 0){
			System.out.println("Not a positive number");
		}
		else{
			for(int i = 1; i<=num; i++){
				if(i % 3 == 0 && i%5 ==0){
					arr[i-1] = "FizzBuzz";
				}
				else if(i%3 ==0){
					arr[i-1] = "Fizz";
				}
				else if(i%5 ==0){
					arr[i-1] = "Buzz";
				}
				else{
					arr[i-1] = Integer.toString(i);
				}
			}
		}
		System.out.println("Results are: ");
		for(int i =0; i<num; i++){
			System.out.println(arr[i]);
		}
		scan.close();
	}
}