public class EqualityOperators
{
    public static void main(String[] args) {
        int value = 12;
        //System.out.println("true = " + true == true); // compile error
        System.out.println("true = " + (true == true));
        System.out.println("false = " + ('a' != 'a'));
        System.out.println("true = " + ((byte) value == (byte) value));
        System.out.println("false = " + ((short) value != (short) value));
        System.out.println("true = " + (value == value));
        System.out.println("true = " + (12F == 12F));
        System.out.println("false = " + (12D != 12d));
        
        System.out.println();
        
        Object a = new Object();
        Object b = new Object();
        Object c = b;
        
        System.out.println("false = " + (a == b));
        System.out.println("false = " + (a == c));
        System.out.println("true = " + (b == c));
        System.out.println("true = " + (a != b));
        System.out.println("true = " + (a != c));
        System.out.println("false = " + (b != c));
    }
}
