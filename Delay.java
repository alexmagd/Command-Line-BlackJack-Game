
public class Delay {
	
										//den einai diko mou
										//apla gia logous aisthitikis
	
	int ms = 1500;

    public void sleep(){

        try{
            Thread.sleep(ms);
        }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
        }

    }

}
