import java.util.Scanner;
class naturalNumSum{
	public static int sum(int num, int count){
		for(int i=0; i<=num; i++){
			count += i;
		}
		return count;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int num = scan.nextInt();
		int count = 0;
		int res = sum(num, count);
		System.out.println("Sum of natural number: "+res);
		scan.close();
	}
}