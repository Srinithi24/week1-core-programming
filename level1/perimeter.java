import java.util.Scanner;
class area{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the perimeter: ");
		int peri = scan.nextInt();
		int side = peri/4;
		System.out.println("The length of the side is "+side+" whose perimeter is "+peri);
		scan.close();
	}
}