import java.util.Scanner;
class reverse{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int originalNumber = num;
		int count = 0;
		while(num > 0){
			num = num /10;
			count ++;
		}
		int[] arr = new int[count];
		for(int i =0; i<count; i++){
			arr[i] = originalNumber %10;
			originalNumber /= 10;
		}
		System.out.println("The reverse array is:")		;
		for(int i = 0; i < count; i++){
			System.out.print(arr[i]+ " ");
		}
		scan.close();
	}
}