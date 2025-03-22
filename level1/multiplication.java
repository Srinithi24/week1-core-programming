import java.util.Scanner;
class multiplication{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int[] arr = new int[4];
		for(int i = 6; i <=9 ; i++){
			arr[i-6] = num*i;
			System.out.println(num +" * "+i+" = "+arr[i-6]);
		}
		scan.close();
	}
}