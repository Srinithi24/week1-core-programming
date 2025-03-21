import java.util.Scanner;
class marks{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the physics: ");
		int physics = scan.nextInt();
		System.out.print("Enter the chemistry: ");
		int chemistry = scan.nextInt();
		System.out.print("Enter the maths: ");
		int maths = scan.nextInt();
		double percentage = (physics + chemistry + maths)/3.0;
		if(percentage  >= 80){
			System.out.println("Average marks: "+percentage+" and the grade: A and the remark: Level 4, above agency-normalized standards");
		}
		else if(percentage >= 70 && percentage <= 79){
			System.out.println("Average marks: "+percentage+" and the grade: B and the remark: Level 3, at agency-normalized standards");
		}
		else if(percentage >= 60 && percentage <= 69){
			System.out.println("Average marks: "+percentage+" and the grade: C and the remark: Level 2, below, but approaching agency-normalized standards");
		}
		else if(percentage >= 50 && percentage <= 59){
			System.out.println("Average marks: "+percentage+" and the grade: D and the remark: Level 1, well below agency-normalized standards");
		}
		else if(percentage >= 40 && percentage <= 49){
			System.out.println("Average marks: "+percentage+" and the grade: E and the remark: Level 1-, too below agency-normalized standards");
		}
		else if(percentage <= 39){
			System.out.println("Average marks: "+percentage+" and the grade: R and the remark: Remedial standards");
		}
		scan.close();
	}
}