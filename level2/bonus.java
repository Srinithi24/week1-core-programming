import java.util.Scanner;
class bonus{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] salary = new double[10];
		int[] years = new int[10];
		double[] newSalary = new double[10];
		double[] newBonus = new double[10];
		double totalBonus = 0;
		double oldSalary = 0;
		double totalNewSalary = 0;
		for(int i = 0; i <10; i++){
			System.out.print("Enter the salary of the employee: ");
			salary[i] = scan.nextDouble();
			System.out.print("Enter the years of service: ");
			years[i] = scan.nextInt();
			oldSalary += salary[i];
		}
		for(int i = 0; i < years.length; i++){
			if(years[i] > 5){
				newBonus[i] = salary[i] * (5.0/100);
			}
			else{
				newBonus[i] = salary[i] * (2.0/100);
			}
			newSalary[i] = newBonus[i] + salary[i];
			totalBonus += newBonus[i];
			totalNewSalary += newSalary[i];
		}
		System.out.println("Old Salary: "+oldSalary);
		System.out.println("Total Bonus: "+totalBonus);
		System.out.println("Total New Salary: "+totalNewSalary);
		scan.close();
	}
}