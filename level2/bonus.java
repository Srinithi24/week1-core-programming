import java.util.Scanner;
class bonus{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the salary: ");
		int salary = scan.nextInt();
		System.out.print("Enter the year of service: ");
		int year = scan.nextInt();
		int bonus = 0;
		if(year > 5){
			bonus = salary * 5/100;
			System.out.println("Bonus Amount: "+ bonus);
		}
		else{
			System.out.println("Bonus Amount: "+bonus);
		}
		
		
		scan.close();
	}
}