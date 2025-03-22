import java.util.Scanner;
class vote{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 1; i<=arr.length; i++){
			System.out.print("Enter the age: ");
			int age = scan.nextInt();
			if(age >= 18){
				System.out.println("The student with the age "+age+" can vote");
			}
			else{
				System.out.println("The student with the age "+age+" cannot vote.");
			}
		}
		
		scan.close();
	}
}