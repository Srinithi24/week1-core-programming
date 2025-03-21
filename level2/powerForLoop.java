import java.util.Scanner;
class powerForLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		System.out.print("Enter the power: ");
		int power = scan.nextInt();
		int res = 1;
		if(num > 0 && power > 0){
			for(int i = 1; i <= power; i++){
				res *= num;
			}
		}
		System.out.println("The result is :"+res);
		scan.close();
	}
}