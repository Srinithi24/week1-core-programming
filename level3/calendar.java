import java.util.Scanner;
class calendar{
	public static final String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
	public static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
	public static boolean isLeapYear(int year){
		return (year % 400 == 0) || (year %100 !=0 && year % 4 ==0);
	}
	public static int getDaysInMonth(int month, int year){
		if(month == 2 && isLeapYear(year)){
			return 29;
		}
		return daysInMonth[month-1];
	}
	public static int getFirstDayOfMonth(int month, int year){
		int d = 1;
		int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
	}
	public static void display(int month, int year){
		System.out.println(monthNames[month-1]+" "+year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		int firstDay = getFirstDayOfMonth(month, year);
		int daysInMonth = getDaysInMonth(month, year);
		for(int i=0; i< firstDay; i++){
			System.out.print("    ");
		}
		for(int day = 1; day <= daysInMonth; day++){
			System.out.printf("%3d", day);
			if((firstDay + day ) % 7 == 0){
				System.out.println();
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
		display(month, year);
        

        scanner.close();
	}
}