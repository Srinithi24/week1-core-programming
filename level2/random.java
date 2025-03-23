import java.util.Scanner;
public class random{
	public int[] generate4DigitRandomArray(int size){
		int[] ran = new int[size];
		for(int i = 0; i<size; i++){
			ran[i] = (int) (Math.random() * 9000)+1000;
		}
		return ran;
	}
	public double[] findAverageMinMax(int[] numbers){
		int sum = numbers[0];
		int min = numbers[0];
		int max = numbers[0];
		for(int i =1; i<numbers.length;i++){
			sum += numbers[i];
			min = Math.min(min, numbers[i]);
			max = Math.max(max, numbers[i]);
		}
		double avg = (double) sum/numbers.length;
		return new double[]{avg, min , max};
		
	} 
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = 5;
		random obj = new random();
		int[] result = obj.generate4DigitRandomArray(num);
		System.out.println("The random numbers: ");
		for(int i =0; i<result.length; i++){
			System.out.print( result[i] +" ");
		}
		double[] ans = obj.findAverageMinMax(result);
		System.out.println("Average: "+ans[0]);
		System.out.println("Minimum value: "+ans[1]);
		System.out.println("Maximum value: "+ans[2]);
		scan.close();
	}
}