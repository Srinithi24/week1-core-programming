import java.util.Scanner;
class feetAndInches{
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the height in centimeters: ");
			int cm = scan.nextInt();
			double inch = cm / 2.54;
			double foot = inch / 12;
			System.out.println("Your height in cm is "+cm+" while in feet is "+ foot+"and inches is "+ inch);
	}
}