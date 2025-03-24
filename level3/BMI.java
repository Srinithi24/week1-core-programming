import java.util.Scanner;
class BMI{
	public static String[][] bmiCalculator(double[][] data){
		String[][] results = new String[10][4];
		for(int i=0; i<10; i++){
			double weight = data[i][0];
			double height = data[i][1]/100.0;
			double bmi = weight /(height * height);
			String status;
			if(bmi <= 18.4){
				status = "Underweight";
			}else if(bmi <=24.9){
				status = "Normal";
			}else if(bmi <=39.9){
				status = "Overweight";
			}else{
				status = "Obese";
			}
			results[i][0] = String.format("%.2f", data[i][1]);
			results[i][1] = String.format("%.2f", data[i][0]);
			results[i][2] = String.format("%.2f",bmi);
			results[i][3] = status;
		}
		return results;
	}
	public static void displayResults(String[][] results){
		System.out.println("Person\tHeight\tWeight\tBMI\tBMI Status");
		for(int i=0; i<10; i++){
			System.out.println((i+1)+"\t"+results[i][0]+"\t"+results[i][1]+"\t"+results[i][2]+"\t"+results[i][3]);
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[][] data = new double[10][2];
		for(int i=0; i<10; i++){
			System.out.print("Enter the weight for "+(i+1)+" in kg: ");
			data[i][0] = scan.nextDouble();
			System.out.print("Enter the height for "+(i+1)+" in cm: ");
			data[i][1] = scan.nextDouble();
		}
		String[][] results = bmiCalculator(data);
		displayResults(results);
	}
}