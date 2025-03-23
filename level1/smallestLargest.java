import java.util.Scanner;
class smallestLargest{
	public static int[] smallLarge(int num1, int num2, int num3){
		int smallest = num1;
		if(num1 <num2 && num1 < num3){
			smallest = num1;
		}else if(num2 < num1 && num2 < num3){
			smallest = num2;
		}else{
			smallest = num3;
		}
		int largest = num1;
		if(num1 > num2 && num1 > num3){
			largest = num1;
		}else if(num2 > num1 && num2 > num3){
			largest = num2;
		}else{
			largest = num3;
		}
		return new int[]{smallest, largest};
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the num1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter the num2: ");
		int num2 = scan.nextInt();
		System.out.print("Enter the num3: ");
		int num3 = scan.nextInt();
		int[] res = smallLarge(num1, num2, num3);
		System.out.println("Smallest: "+res[0]);
		System.out.println("Largest: "+res[1]);
		scan.close();
	}
}