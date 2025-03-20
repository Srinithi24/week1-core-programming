import java.util.Scanner;
class yardsMiles{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Distance in feet: ");
		int distance = scan.nextInt();
		float yard = (float) distance/3;
		float miles = yard/1760;
		System.out.println("The distance in feet is "+distance+" distance in yards "+yard+" distance in miles "+miles);
		scan.close();
	}
}