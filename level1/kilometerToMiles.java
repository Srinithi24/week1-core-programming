import java.util.Scanner;
class kilometerToMiles{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the kilometer: ");
		int kilometer = scan.nextInt();
		double miles = 0.6 * (double) kilometer;
		System.out.println("The total miles is "+miles+" mile for the given "+kilometer+" km");
	}
}