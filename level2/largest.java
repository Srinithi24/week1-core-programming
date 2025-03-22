import java.util.Scanner;
class largest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int originalNumber = num;
		int maxDigit = 10;
		int[] arr = new int[maxDigit];
		int index = 0;
		while(num > 0){
			arr[index] = num%10;
			num /= 10;
			index ++;
			if(index == maxDigit){
				break;
			}
		}
		int largest = 0;
		int secondLargest = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];	
			}
		}
		System.out.println("Largest number: "+largest);
		System.out.println("Second Largest number: "+secondLargest);
		
		scan.close();
	}
}