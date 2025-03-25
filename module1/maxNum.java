import java.util.Scanner;
class maxNum{
	public static int findMax(int num1, int num2, int num3){
		return Math.max(num1, Math.max(num2,num3));
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the num1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter the num2: ");
		int num2 = scan.nextInt();
		System.out.print("Enter the num3: ");
		int num3 = scan.nextInt();
		int max = findMax(num1,num2, num3);
		System.out.println("The max num among "+num1+" ,"+num2+" and "+num3+" is: "+max);
	}
}