import java.util.Scanner;
class ageHeight{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] name = {"Amar", "Akbar", "Anthony"};
		int[] age = new int[3];
		double[] height = new double[3];
		for(int i=0; i< 3; i++){
			System.out.print(name[i]+" age: ");
			age[i] = scan.nextInt();
			System.out.print(name[i]+" height: ");
			height[i] = scan.nextDouble();
		}
		int minAge = age[0];
		String youngest = name[0];
		for(int i=1; i<age.length; i++){
			if(age[i] < minAge){
				minAge = age[i];
				youngest = name[i];
			}
		}
		double minHeight = height[0];
		String tallest = name[0];
		for(int i=1; i<height.length; i++){
			if(height[i] > minHeight){
				minHeight = height[i];
				tallest = name[i];
			}
		}
		System.out.println(youngest+" is the youngest");
		System.out.println(tallest+" is the tallest");
		
		scan.close();
	}
}