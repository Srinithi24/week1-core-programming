import java.time.LocalDate;
import java.util.Scanner;
public class dateArithmetic{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a date (YYYY - MM - DD): ");
		LocalDate date = LocalDate.parse(scan.next());
		scan.close();
		LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
		System.out.println("Modified date: "+ modifiedDate);
	}
}