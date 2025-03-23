import java.util.Scanner;

public class studentVoteChecker{
	public boolean canStudentVote(int age) {
			if(age<18){
				return false;
			}
			return true;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		studentVoteChecker obj = new studentVoteChecker();
		for(int i =0; i<10; i++){
			System.out.print("Enter the age of student: ");
			arr[i] = scan.nextInt();
		}
		for(int i =0; i < arr.length; i++){
				if(obj.canStudentVote(arr[i])){
					System.out.println(arr[i]+ " is eligible");
				}
				else{
					System.out.println(arr[i]+ " is not eligible");
				}
		}
		scan.close();
	}
	
}