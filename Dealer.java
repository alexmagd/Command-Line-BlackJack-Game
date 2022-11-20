
public class Dealer {
	
	 private Delay timer = new Delay();
	 
	 private RandCard PCcard1 = new RandCard();;
	 private RandCard PCcard2= new RandCard();
	 private int PCsum = PCcard1.getValue() + PCcard2.getValue();

	 public int getSum() {
		 
		 return PCsum;
	 }
	 
	 public int getCard(int num) {
		 if(num == 1) {
			 return PCcard1.getValue();
		 }
		 else{
			 return PCcard2.getValue();
		 }
	 }
	 
	 public void Play(){
		 System.out.println("Dealer's turn!");
		 timer.sleep();
	     System.out.println("The hidden card is " + PCcard2.getValue());
	     timer.sleep();
	     System.out.println("Dealer's total " + PCsum);
	     timer.sleep();
	     while(PCsum <= 16){
	    	 RandCard PCcard = new RandCard();
	         PCsum = PCsum + PCcard.getValue();
	         System.out.println("Dealer picked a card (" + PCcard.getValue() + ")");
	         timer.sleep();
	         System.out.println("Dealer's new total is " + PCsum);          
	         timer.sleep();           
	    }                   
	 } 	
}