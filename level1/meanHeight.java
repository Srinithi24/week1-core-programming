import java.util.Scanner;
class meanHeight{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double totalHeight = 0;
		double[] height = new double[11];
		for(int i =0; i<height.length; i++){
			System.out.print("Enter the height: ");
			height[i] = scan.nextDouble();
			totalHeight += height[i];
		}
		double mean = totalHeight / 11;
		System.out.println("Mean height of the football team is: "+mean);
	}
}