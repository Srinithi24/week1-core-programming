import java.util.Scanner;
class Votes{
	public static int[] age(int num){
		int[] age = new int[num];
		for(int i=0; i<num; i++){
			age[i] = (int)(Math.random() * 30)+10;
		}
		return age;
	}
	public static int[][] canVote(int[] age){
		int[][] vote = new int[age.length][2];
		for(int i=0; i<age.length; i++){
			vote[i][0] = age[i]; 
            vote[i][1] = (age[i] >= 18) ? 1 : 0;
		}
		return vote; 
	}
	public static void display(int[][] vote){
		System.out.println("Age | Can vote?");
		for(int i =0 ; i < vote.length; i++){
			System.out.println(vote[i][0] + " | "+ (vote[i][1] == 1 ? "Yes" : "No"));
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = 10;
		int[] ages = age(num);
		int[][] voteRes = canVote(ages);
		display(voteRes);
		scan.close();
	}
}