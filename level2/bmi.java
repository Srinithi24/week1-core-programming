import java.util.Scanner;
public class bmi{
	public static String weightStatus(double value){
		String status = " ";
		if(value <= 18.4){
			status = "Underweight";
		}
		else if(value >= 18.5 && value <= 24.9 ){
			status = "Normal";
		}
		else if(value >= 25.0 && value <= 39.9 ){
			status = "Overweight";
		}
		else{
			status = "Obese";
		}
		return status;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[][] data = new double[10][3];
		for(int i=0; i<10; i++){
			System.out.println("Enter the weight: ");
			data[i][0] = scan.nextDouble();
			System.out.println("Enter the height: ");
			data[i][1] = scan.nextDouble() / 100;
			data[i][2] = data[i][0] / (data[i][1] * data[i][1]);
		}
		for(int i = 0; i<10; i++){
			String answer = weightStatus(data[i][2]);
			System.out.println(answer);
		}
		
		scan.close();
	}
}