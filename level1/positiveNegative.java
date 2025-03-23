import java.util.Scanner;
class positiveNegative{
	public static int check(int num){
		if(num == 0){
			return 0;
		}
		else if (num<0){
			return -1;
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		int res = check(num);
		System.out.println(res);
		scan.close();
	}
}