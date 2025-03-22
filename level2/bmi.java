import java.util.Scanner;
class bmi{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the total number of persons: ");
		int num = scan.nextInt();
		double[] weight = new double[num];
		double[] height = new double[num];
		double[] bmi = new double[num];
		String[] weightStatus = new String[num];
		for(int i =0; i< num; i++){
			System.out.print("Enter the weight: ");
			weight[i] = scan.nextDouble();
			System.out.print("Enter the height: ");
			height[i] = scan.nextDouble();
			bmi[i] = weight[i]/(height[i] * height[i]);
		}
		for(int i =0 ; i<bmi.length; i++){
			if(bmi[i] <= 18.4){
				weightStatus[i] = "Underweight";
			}
			else if(bmi[i] >= 18.5 && bmi[i] <= 24.9 ){
				weightStatus[i] = "Normal";
			}
			else if(bmi[i] >= 25.0 && bmi[i] <= 39.9 ){
				weightStatus[i] = "Overweight";
			}
			else{
				weightStatus[i] = "Obese";
			}
		}
		for(int i = 0; i<num; i++){
			System.out.println("Weight: "+weight[i]);
			System.out.println("Height: "+height[i]);
			System.out.println("BMI: "+bmi[i]);
			System.out.println("weightStatus: "+weightStatus[i]);
		}
		scan.close();
	}
}