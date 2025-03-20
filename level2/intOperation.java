import java.util.Scanner;
class intOperation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scan.nextInt();
		System.out.print("Enter b: ");
		int b = scan.nextInt();
		System.out.print("Enter c: ");
		int c = scan.nextInt();
		int res1 = a + b *c;
		int res2 = a * b + c;
		int res3 =  c + a / b;
		int res4 = a % b + c;
		System.out.println("The result of int operations are "+res1+", "+res2+", "+res3+" and "+res4);
		scan.close();
	}
}