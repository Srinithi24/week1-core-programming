import java.util.Scanner;
class bmi{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the weight: ");
		double weight = scan.nextDouble();
		System.out.print("Enter the height: ");
		double height = scan.nextDouble();
		double heightInMeter = height/100;
		double bmi = weight / (heightInMeter * heightInMeter);
		
		if(bmi <= 18.4){
			System.out.println("Underweight");
		}
		else if(bmi >= 18.5 && bmi <= 24.9){
			System.out.println("Normal");
		}
		else if(bmi >= 25.0 && bmi <= 39.9){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
		
		
		scan.close();
	}
}