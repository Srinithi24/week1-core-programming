import java.util.Scanner;
class dayOfWeek{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int m = scan.nextInt();
		System.out.print("Enter the day: ");
		int d = scan.nextInt();
		System.out.print("Enter the year: ");
		int y = scan.nextInt();
		int y0 = y - (14 - m)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m +12 * ((14 - m)/12) - 2;
		int d0 = (d + x + 31 *m0/ 12) % 7;
		switch(d0){
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid");
				break;
		}
		scan.close();
	}
}