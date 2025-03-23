import java.util.Scanner;

class leapYear{
	public static boolean leap(int year) {
		if(year >= 1582){
			return ((year%4 ==0 && year%100 != 0) || (year % 400 ==0));
		}
		return false;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = scan.nextInt();
		if(leap(year)){
			System.out.println(year + " is a leap year");
		}
		else{
			System.out.println(year + " is not a leap year");
		}
		scan.close();
	}
}