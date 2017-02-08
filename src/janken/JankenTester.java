package janken;
import java.util.Scanner;

/**
 *
 * @author c16309
 */
public class JankenTester {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String[] hands = {"グー","チョキ","パー"};
        int retry,user,comp1,comp2;
        Janken[] a = new Janken[3];
        a[0] = new Player();
        a[1] = new Comp();
        a[2] = new Comp();
        do{
            user = a[0].hand();
            comp1 = a[1].hand();
            comp2 = a[2].hand();
            
            System.out.println("じゃんけん");
            System.out.println("ポン");
            System.out.println("あなた：" + hands[user] + "  NPC1：" + hands[comp1] + "  NPC2：" + hands[comp2] );

            int judge = (user + comp1 + comp2) % 3;            
            if(judge == 2 && comp1 == comp2)
                judge = 1;
            else if(judge == 1 && comp1 == comp2)
                judge = 2;
            
            switch(judge){
                case 0: System.out.println("引き分けです。"); break;
                case 1: System.out.println("あなたの勝ちです。"); break;        
                case 2: System.out.println("あなたの負けです。"); break;
            }
            
            do{
                System.out.println("もう一度? (0)いいえ　(1)はい：");
                retry = stdIn.nextInt();
            }while(retry != 0 && retry != 1);
        }while(retry == 1);
        
        

    }
}
