import java.util.Scanner;
class season{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the month: ");
		String month = scan.nextLine();
		System.out.print("Enter the day: ");
		int day = scan.nextInt();
		if((month.equalsIgnoreCase("March") && day >= 20) || (month.equalsIgnoreCase("April") && day <= 30) || (month.equalsIgnoreCase("May") && day <= 31) || (month.equalsIgnoreCase("June") && day <= 20)){
			System.out.println("It's a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
		scan.close();
	}
}