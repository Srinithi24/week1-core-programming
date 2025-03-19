import java.util.Scanner;
class perimeter{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length: ");
		double length = scan.nextDouble();
		System.out.print("Enter width: ");
		double width = scan.nextDouble();
		double perimeter = 2 * (length + width);
		System.out.println("Perimeter of rectange with length "+length+" and width "+width+" is "+perimeter);
		scan.close();
	}
}