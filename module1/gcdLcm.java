import java.util.Scanner;
class gcdLcm{
	public static int gcdCalculate(int num1, int num2){
		int gcd = 0;
		int num = Math.min(num1, num2);
		for(int i = 1; i<=num; i++){
			if(num1 % i ==0 && num2 % i==0){
				gcd = i;
			}
		}return gcd;
	}
	public static int lcmCalculate(int num1, int num2, int gcd){
		return (num1 * num2)/gcd;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number 1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter a number 2: ");
		int num2 = scan.nextInt();
		int gcd = gcdCalculate(num1, num2);
		int lcm = lcmCalculate(num1, num2, gcd);
		System.out.println("GCD: "+gcd);
		System.out.println("LCM: "+lcm);
		scan.close();
	}
}