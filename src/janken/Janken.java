package janken;

/**
 *
 * @author c16309
 */
abstract class Janken {
    abstract int hand();
    public void print_info(){
        System.out.println("抽象クラス");
    }
}
