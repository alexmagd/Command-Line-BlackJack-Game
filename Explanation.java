
public class Explanation {
	
	Delay timer = new Delay();
	
	public void explain(){
        
        System.out.println("BlackJack is a game in which you draw cards to get to 21 or as close to 21 as you can.");
        System.out.println("The dealer does the same thing!");
        timer.sleep();
        System.out.println("If you get past 21 you lose no matter what the dealer does");
        timer.sleep();
        System.out.println("To win you need to have a better score (closer to 21) than the dealer");
        System.out.println("If the dealer gets past 21 YOU win!");
        timer.sleep();
        System.out.println("Good luck and have fun!");
        System.out.println("         ");
        System.out.println("         ");
    }

}
