package janken;
import java.util.Random;
/**
 *
 * @author c16309
 */
public class Comp extends Janken{    
    @Override
    int hand() {
        Random rand = new Random();
    
        int hand = rand.nextInt(21);
        return hand % 3;
    }
    
}
