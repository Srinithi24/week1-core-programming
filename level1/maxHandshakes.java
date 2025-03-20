import java.util.Scanner;
class maxHandshakes{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numOfStudents = scan.nextInt();
		int handshakes = (numOfStudents * (numOfStudents -1))/2;
		System.out.println("The total number of Students is "+numOfStudents+" and The maximum number of handshakes is "+handshakes);
		scan.close();
	}
}