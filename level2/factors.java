import java.util.Scanner;
class factors{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int temp = num;
		int count = 0;
		for(int i =1; i<=num; i++){
			if(num %i ==0){
				count++;
			}
		}
		int[] factors = new int[count];
		int sum = 0;
		int sumOfSquares = 0;
		int product = 1;
		int index = 0;
		for(int i =1; i<=num; i++){
			if(num%i == 0){
				factors[index] = i;
				index ++;
				sum += i;
				sumOfSquares += (Math.pow(i,2));
				product *= i;
			}
		}
		System.out.println("Factors array: ");
		for(int i =0; i<factors.length; i++){
			System.out.println(factors[i] +" ");
		}
		System.out.println("Sum: "+sum);
		System.out.println("Sum of squares: "+sumOfSquares);
		System.out.println("Product: "+product);
		
	}
}