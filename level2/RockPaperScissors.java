import java.util.Scanner;
class RockPaperScissors{
	public static String computerChoice(){
		String[] choices = {"rock", "paper","scissors"};
		int index = (int) (Math.random() * 3);
		return choices[index];
	}
	public static String winner(String userChoice, String compChoice){
		if(userChoice.equalsIgnoreCase(compChoice)){
			return "Draw";
		}else if((userChoice.equalsIgnoreCase("rock") && compChoice.equals("scissors")) ||
                   (userChoice.equalsIgnoreCase("scissors") && compChoice.equals("paper")) ||
                   (userChoice.equalsIgnoreCase("paper") && compChoice.equals("rock"))){
					   return "user won";
				   }
		else{
			return "computer won";
		}		  
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		
		int userWins = 0;
		int compWins = 0;
		int draw = 0;
		System.out.println("Number of rounds you want to play? ");
		int num =scan.nextInt();
		scan.nextLine();
		for(int i=1; i<= num; i++){
			System.out.print("Enter rock, paper or scissors? ");
			String userChoice = scan.nextLine().trim();
		
			String compChoice = computerChoice();
			String winner = winner(userChoice, compChoice);
			if (winner.equals("user won")) userWins++;
			else if (winner.equals("computer won")) compWins++;
			else draw++;
			System.out.println("User Choice: " + userChoice);
			System.out.println("Computer Choice: " + compChoice);
			System.out.println("Winner: " + winner);
		}
		System.out.println("Total Games: " + num);
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draw);
		System.out.printf("User Win Percentage: %.2f%%\n", (userWins * 100.0) / num);
		System.out.printf("Computer Win Percentage: %.2f%%\n", (compWins * 100.0) / num);

		scan.close();
	}
}