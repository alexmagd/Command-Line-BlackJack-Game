import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Delay timer = new Delay();
        int playAgain = 1;

        														//Start of the game
        System.out.println("         ");
        System.out.println("Welcome to the BlackJack game!");
        System.out.println("         ");
        System.out.println("If you want a short explanation press 1, else press 0");
        

        														//User inputs if he wants an explanation or not
        Scanner input = new Scanner(System.in);
        int answer;
        do{
            answer = input.nextInt();
            if((answer != 1) && (answer != 0)){
                System.out.println("Your answer must be 1 or 0! Please try again.");
            }
        }while ((answer != 1) && (answer != 0));
        
        if(answer == 1){ 										 //short explanation of what blackjack is
           Explanation explanation = new Explanation();
            explanation.explain();
        }
		
		
		
		while (playAgain == 1) {
			Dealer dealer = new Dealer();
		    Player player = new Player();
			timer.sleep();
			System.out.println("Your cards are: " + player.getCard(1) + " and " + player.getCard(2));
            System.out.println("Your total is: " + player.getSum());
            System.out.println("         ");
            timer.sleep();
            System.out.println("The dealer's cards are " + dealer.getCard(1) + " and a second hidden card!");
            System.out.println("         ");
			
			player.Play();
			
			if(player.getSum() <= 21){
				
	            dealer.Play();
	            timer.sleep();
	            if(dealer.getSum() > 21){														//checking who won
	                System.out.println("Dealer has exceed 21 (" + dealer.getSum() + ").");
	                System.out.println("Congrats YOU win!");
	            }
	            else{
	                System.out.println("Your score: " + player.getSum());
	                timer.sleep();
	                System.out.println("Dealer's score: " + dealer.getSum());
	                timer.sleep();
	                if(player.getSum() > dealer.getSum()){
	                    System.out.println("You win!!!");
	                }
	                else{
	                    System.out.println("Dealer wins!!!");
	                }        
	            }
	        }
			
	        timer.sleep();
	        System.out.println("If you want to play again press 1 else press 0.");
	        do{
	            playAgain = input.nextInt();
	            if((playAgain != 1) && (playAgain != 0)){
	                System.out.println("Your answer must be 1 or 0! Please try again.");
	            }
	        }while ((playAgain != 1) && (playAgain != 0));
	        if(playAgain == 1){
	            System.out.println("         ");
	            System.out.println("Great. Let's play again!");
	        }
	        else{
	            System.out.println("         ");
	            System.out.println("OK see you next time!");
	        }
		}
	}
}
