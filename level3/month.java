import java.util.Scanner;
class month{
	public static String monthName(int month){
		String[] months = {"Jan", "Feb", "March", "April", "May", "June", "July", "August", "Sept","Oct","Nov","Dec"};
		return months[month - 1];
	}
	public static boolean leapYear(int year){
		return ((year % 4==0) && (year %100!=0) || (year%400 ==0));
	}
	public static int days(int month, int year){
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(month == 2 && leapYear(year)){
			return 29;
		}
		return days[month-1];
 	}
	public static int firstDay(int month, int year){
		int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
	}
	public static void displayCalendar(int month, int year){
		System.out.println(monthName(month)+"  "+year);
		System.out.println("Sun Mon Tue Wed Thur Fri Sat");
		int daysInMonth = days(month, year);
		int firstDay = firstDay(month, year);
		for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); 
        }
		for(int i =1; i<daysInMonth; i++){
			System.out.printf("%3d ", i);
			if((i+firstDay)%7 ==0){
				System.out.println();
			}
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int month = scan.nextInt();
		System.out.print("Enter the year: ");
		int year = scan.nextInt();
		displayCalendar(month, year);
	}
}