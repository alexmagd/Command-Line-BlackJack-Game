import java.util.Scanner;

public class Player {
	    										//Player's card 1 and 2
	    private RandCard PLcard1 = new RandCard();
	    private RandCard PLcard2 = new RandCard();

	    private int PLsum = PLcard1.getValue() + PLcard2.getValue();
	    
	    private int answer;
	    private Scanner input = new Scanner(System.in);
	
	public int getSum() {
		 
		 return PLsum;
	 }
	public int getCard(int num) {
		 if(num == 1) {
			 return PLcard1.getValue();
		 }
		 else{
			 return PLcard2.getValue();
		 }
	 }
	
	public void Play() {                                                                       //player chooses to draww a card or not
        System.out.println("If you want to draw a card press 1, else press 0.");
        do{
            answer = input.nextInt();
            if((answer != 1) && (answer != 0)){
                System.out.println("Your answer must be 1 or 0! Please try again.");
            }
        }while ((answer != 1) && (answer != 0));

        
        while(answer != 0){

            RandCard PLcard = new RandCard();
            PLsum = PLsum + PLcard.getValue();
            System.out.println("You picked a(n) " + PLcard.getValue());
            System.out.println("Your new score is " + PLsum);

            if(PLsum > 21){
                    System.out.println("You lost! Better luck next time!");
                    answer = 0;
            }
            else{
                    System.out.println("If you want to draw another card press 1, else press 0.");
                    do{
                        answer = input.nextInt();
                        if((answer != 1) && (answer != 0)){
                            System.out.println("Your answer must be 1 or 0! Please try again.");
                        }
                    }while ((answer != 1) && (answer != 0));
            }
        }
	}
}