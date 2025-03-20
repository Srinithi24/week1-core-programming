import java.util.Scanner;
class chocolates{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total number of chocolates: ");
		int chocolates = scan.nextInt();
		System.out.print("Enter total number of students: ");
		int students = scan.nextInt();
		int eachGets = chocolates/students;
		int remaining = chocolates%students;
		System.out.println("The number of chocolates each child gets is "+eachGets+" and the number of remaining chocolates are "+remaining);
		scan.close();
	}
}