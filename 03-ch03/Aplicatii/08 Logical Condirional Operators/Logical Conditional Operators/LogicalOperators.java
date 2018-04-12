public class LogicalOperators
{
    public static void main(String [] args) {
        boolean and1 = true && true;
        System.out.println("true = " + and1);
        boolean and2 = true && false;
        System.out.println("false = " + and2);
        boolean and3 = false && true;
        System.out.println("false = " + and3);
        boolean and4 = false && false;
        System.out.println("false = " + and4);
        
        System.out.println();
        
        boolean or1 = true || true;
        System.out.println("true = " + or1);
        boolean or2 = true || false;
        System.out.println("true = " + or2);
        boolean or3 = false || true;
        System.out.println("true = " + or3);
        boolean or4 = false || false;
        System.out.println("false = " + or4);
    }
}
