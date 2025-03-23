import java.util.Scanner;
class seasons{
	public static boolean season(String month, int day){
		return ((month.equalsIgnoreCase("March") && day >= 20) || (month.equalsIgnoreCase("April") && day <= 30) || (month.equalsIgnoreCase("May") && day <= 31) || (month.equalsIgnoreCase("June") && day <= 20));
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the month: ");
		String month = scan.nextLine();
		System.out.print("Enter the day: ");
		int day = scan.nextInt();
		boolean res = season(month, day);
		System.out.println(res);
		scan.close();
	}
}