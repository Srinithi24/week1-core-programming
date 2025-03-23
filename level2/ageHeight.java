import java.util.Scanner;
class ageHeight{
	public static String youngest(String[] name, int[] age){
		int young = 0;
		for(int i= 1; i<age.length; i++){
			if(age[i] < age[young]){
				young = i;
			}
		}
		return name[young];
	}
	public static String tallest(String[] name, double[] height){
		int tall = 0;
		for(int i= 1; i<height.length; i++){
			if(height[i] > height[tall]){
				tall = i;
			}
		}
		return name[tall];
	}
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
		System.out.println(youngest(name, age)+" is the youngest");
		System.out.println(tallest(name, height)+" is the tallest");
		
		scan.close();
	}
}