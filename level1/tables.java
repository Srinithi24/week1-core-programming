import java.util.Scanner;
class tables{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int[] arr = new int[10];
		for(int i = 0; i< arr.length; i++){
			arr[i] = num *(i+1);
			System.out.println(num + " * "+ (i+1)+ " = "+ arr[i]);
		}
		
		scan.close();
	}
}