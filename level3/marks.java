import java.util.Scanner;
class marks{
	public static int[][] scoresCalculate(int num){
		int[][] scores = new int[num][3];
		for(int i=0; i<num; i++){
			scores[i][0] = (int) (Math.random() * 90) + 10;
			scores[i][1] = (int) (Math.random() * 90) + 10;
			scores[i][2] = (int) (Math.random() * 90) + 10;
		}
		return scores;
	}
	public static double[][] resultsCalculate(int[][] scores){
		int students = scores.length;
		double[][] res =new double[students][3];
		for(int i =0; i<students; i++){
			int total = scores[i][0] + scores[i][1] + scores[i][2];
			double average = total/3.0;
			double percentage = (total/300.0) * 100;
			
			res[i][0] = total;
			res[i][1] = Math.round(average*100.0)/100.0;
			res[i][2] = Math.round(percentage* 100.0)/100.0;
		}
		return res;
	}
	public static void table(int[][] scores, double[][] res){
		System.out.println("Score table");
		System.out.println("Student\tPhysics\tChem\tMaths\tTotal\tAverage\tPercentage");
		for(int i= 0; i< scores.length; i++){
			System.out.println((i+1) +"\t"+scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2] + "\t" +
			(int) res[i][0] + "\t" + res[i][1] + "\t" + res[i][2] + "%");
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		int[][] scores = scoresCalculate(num);
		double[][] res = resultsCalculate(scores);
		table(scores, res);
		scan.close();
	}
}