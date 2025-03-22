import java.util.Scanner;
class positiveNegative{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter the number: ");
			arr[i] = scan.nextInt();
			if(arr[i] == 0){
				System.out.println("The number is 0.");
			}
			else if(arr[i] < 0){
				System.out.println(arr[i]+ " the number is negative.");
			}
			else{
				System.out.println(arr[i]+ " the number is positive.");
			}
		}
		if(arr[0] == arr[4]){
			System.out.println("Both are equal");
		}
		else if(arr[0] > arr[4]){
			System.out.println("First number is greatest");
		}
		else{
			System.out.println("Last number is greatest");
		}
		
		scan.close();
	}
}