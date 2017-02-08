package janken;
import java.util.Scanner;
/**
 *
 * @author c16309
 */
public class Player extends Janken{

    @Override
    int hand() {       
        int hand;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("出す手を決めてください");
        do{
            System.out.print("グー=0 チョキ=1 パー=2>>");
            hand = stdIn.nextInt();
        }while(hand<1 && hand>3);
        
        return hand;
    }
}
