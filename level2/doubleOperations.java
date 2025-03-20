import java.util.Scanner;
class doubleOperation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = scan.nextInt();
		System.out.print("Enter b: ");
		double b = scan.nextInt();
		System.out.print("Enter c: ");
		double c = scan.nextInt();
		double res1 = a + b *c;
		double res2 = a * b + c;
		double res3 =  c + a / b;
		double res4 = a % b + c;
		System.out.println("The result of int operations are "+res1+", "+res2+", "+res3+" and "+res4);
		scan.close();
	}
}