import java.util.Scanner;
class bmiMultiDim{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the total number of persons: ");
		int num = scan.nextInt();
		double[][] personData = new double[num][3];
		String[] weightStatus = new String[num];
		for(int i =0; i< num; i++){
			System.out.print("Enter weight: ");
            double weight = scan.nextDouble();
            if (weight <= 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }
            personData[i][0] = weight;
            System.out.print("Enter height: ");
            double height = scan.nextDouble();
            if (height <= 0) {
                System.out.println("Invalid input.");
                i--; 
                continue;
            }
            personData[i][1] = height;
			personData[i][2] = personData[i][0]/(personData[i][1]  * personData[i][1] );
		}
		for(int i =0 ; i<num ;i++){
			if(personData[i][2] <= 18.4){
				weightStatus[i] = "Underweight";
			}
			else if(personData[i][2] >= 18.5 && personData[i][2] <= 24.9 ){
				weightStatus[i] = "Normal";
			}
			else if(personData[i][2] >= 25.0 && personData[i][2] <= 39.9 ){
				weightStatus[i] = "Overweight";
			}
			else{
				weightStatus[i] = "Obese";
			}
		}
		for(int i = 0; i<num; i++){
			System.out.println("Weight: "+personData[i][0]);
			System.out.println("Height: "+personData[i][1]);
			System.out.println("BMI: "+personData[i][2]);
			System.out.println("weightStatus: "+weightStatus[i]);
		}
		scan.close();
	}
}