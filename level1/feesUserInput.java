import java.util.Scanner;
class feesUserInput{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the fee amount: ");
		int fee = scan.nextInt();
		System.out.print("Enter the discount percent: ");
		double discountPercent = scan.nextInt();
		double discount = (double) fee * (discountPercent/100);
		double discountFee = fee - discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountFee);
	}
}