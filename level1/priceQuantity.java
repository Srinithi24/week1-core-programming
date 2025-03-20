import java.util.Scanner;
class priceQuantity{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Unit price: ");
		int unitPrice = scan.nextInt();
		System.out.print("Enter the quantity: ");
		int quantity = scan.nextInt();
		int totalPrice = unitPrice * quantity;
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
		scan.close();
	}
}