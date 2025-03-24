import java.util.Scanner;
class marks{
	public static int[][] calculateMarks(int number){
		int[][] calMark = new int[number][3];
		for(int i=0; i<number; i++){
			calMark[i][0] = (int) (Math.random() * 89) + 10;
			calMark[i][1] = (int) (Math.random() * 89) + 10;
			calMark[i][2] = (int) (Math.random() * 89) + 10;
		}return calMark;
	}
	
	public static double[][] calculateResults(int[][] calMark, int num) {
		double[][] results = new double[num][3]; 

		for (int i = 0; i < num; i++) {
			double total = calMark[i][0] + calMark[i][1] + calMark[i][2];
			double average = total / 3.0;
			double percentage = (total / 300.0) * 100; 

			results[i][0] = Math.round(total * 100.0) / 100.0;        
			results[i][1] = Math.round(average * 100.0) / 100.0;      
			results[i][2] = Math.round(percentage * 100.0) / 100.0;   
		}
		return results;
	}
	public static String[][] gradeCalculation(double[][] results, int num){
		String[][] grades = new String[num][2];
		for(int i=0; i< num; i++){
			double percent = results[i][2];
			String grade;
			if(percent >= 80){
				grade = "A";
			}else if(percent >=70){
				grade = "B";
			}else if(percent >=60){
				grade = "C";
			}else if(percent >=50){
				grade = "D";
			}else if(percent >=40){
				grade = "E";
			}else{
				grade = "R";
			}
			grades[i][0] = String.format("%.2f", percent);
			grades[i][1] = grade;
		}
		return grades;
	}
	public static void displayTable(int[][] calMark,double[][] results, int num, String[][] grades){
		System.out.println("Score Table");
		System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
		for(int i=0; i < num; i++){
			System.out.println((i+1) + "\t" + calMark[i][0] + "\t" + calMark[i][1] + "\t\t" + calMark[i][2]+"\t"+String.format("%.2f", results[i][0] )+ "\t" +
			String.format("%.2f", results[i][1]) + "\t" +String.format("%.2f", results[i][2]) + "\t\t" + grades[i][1]);
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = scan.nextInt();
		int[][] calMark = calculateMarks(students);
		double[][] results = calculateResults(calMark, students);
		String[][] grades = gradeCalculation(results, students);
		displayTable(calMark,results, students, grades);
		scan.close();
	}
}