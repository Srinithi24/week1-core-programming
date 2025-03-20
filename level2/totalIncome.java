import java.util.Scanner;
class totalIncome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter salary: ");
		int salary = scan.nextInt();
		System.out.print("Enter bonus: ");
		int bonus = scan.nextInt();
		int income = salary + bonus;
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);
		scan.close();
	}
}