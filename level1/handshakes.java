import java.util.Scanner;
class handshakes {
	public static int calculateHanshakes(int students){
		int handshakes = students * (students-1)/2;
		return handshakes;
	}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int students = scan.nextInt();
		int res = calculateHanshakes(students);
		System.out.println("Number of handshakes: "+res);
        scan.close();
    }
}
