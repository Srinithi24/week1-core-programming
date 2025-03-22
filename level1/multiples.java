import java.util.Scanner;
class multiples{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		int[] arr = new int[10];
		while(true){
			if(i >= arr.length){
				break;
			}
			System.out.print("Enter a number: ");
			int num = scan.nextInt();
			if(num <= 0){
				break;
			}
			else{
				arr[i] = num;
				i++;
			}
		}
		for(int j = 0; j < i; j++){
			sum += arr[j];
		}
		System.out.print("Sum: "+sum);
		
		scan.close();
	}
}