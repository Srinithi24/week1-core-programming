import java.util.Scanner;
public class bonus{
	public static int[][] details(int num){
		int[][] details = new int[num][2];
		for(int i=0; i<num; i++){
			int salary =(int)(Math.random() * 90000)+10000;
			int years =(int) (Math.random() * 10)+1;
			details[i][0] = salary;
			details[i][1] = years;
		}
		return details;
	}
	public static double[][] bonusData(int[][] details){
		double[][] bonusData = new double[details.length][2];
		for(int i =0; i< details.length; i++){
			int salary = details[i][0];
			int years = details[i][1];
			double bonusPercent = (years > 5) ? 5.0 / 100 : 2.0 / 100; 
            double bonusAmount = salary * bonusPercent;
            double newSalary = salary + bonusAmount;
			bonusData[i][0] = newSalary;
            bonusData[i][1] = bonusAmount;
			
		}return bonusData;
	}
	public static void table(int[][] details, double[][] bonusData){
		double totalOldSal = 0; 
		double totalNewSal = 0; 
		double totalBonus = 0;

		System.out.println("Bonus Calculation table: ");
		System.out.println("EmpID\tOld Salary\tYears\tBonus Amount\tNew Salary");
		for(int i =0; i< details.length; i++){
			int oldSalary = details[i][0];
			int years = details[i][1];
			double bonusAmount =Math.round(bonusData[i][1]);
			double newSalary = Math.round(bonusData[i][0]);
			
			System.out.println((i+1) +"\t"+oldSalary+"\t\t"+years+"\t"+bonusAmount+"\t\t"+newSalary);
			totalOldSal += oldSalary;
			totalNewSal += newSalary;
			totalBonus += bonusAmount;
			
		}
		System.out.println("Total\t" + Math.round(totalOldSal) + "\t\t\t" + Math.round(totalBonus) + "\t\t" + Math.round(totalNewSal));
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = 10;
		int[][] detailsArray = details(num);
		double[][] bonusArray = bonusData(detailsArray);
		table(detailsArray, bonusArray);
		
		scan.close();
	}
}