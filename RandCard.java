import java.util.Random;

public class RandCard {
	
	Random random = new Random();

    private int value;

    public RandCard(){
    	value = random.nextInt(11)+1;
    }

    public int getValue(){

        return value;
    }
}
