import java.util.Scanner;
class factRecursion{
	public static int recursion(int num){
		int rec = 1;
		for(int i = num; i >= 1; i--){
			rec *= i;
		}
		return rec;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int res = recursion(num);
		System.out.println(res);
	}
}