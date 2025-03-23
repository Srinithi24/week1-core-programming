import java.util.Scanner;
class quotientRemainder{
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int remainder = number%divisor;
		int quotient = number/divisor;
		return new int[]{remainder , quotient};
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scan.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = scan.nextInt();
		int[] res = findRemainderAndQuotient(number, divisor);
		System.out.println("remainder: "+res[0]);
		System.out.println("quotient: "+res[1]);
		scan.close();
	}
}