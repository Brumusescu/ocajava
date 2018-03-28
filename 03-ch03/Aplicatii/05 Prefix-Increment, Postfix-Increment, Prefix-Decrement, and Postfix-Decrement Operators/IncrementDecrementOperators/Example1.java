public class Example1
{
    public static void main (String[] args) {
        int x = 10;
        int y = ++x;
        System.out.println("Prefix-increment (x = 10, y = ++x):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        System.out.println();
        
        x = 10;
        y = x++;
        System.out.println("Postfix-increment (x = 10, y = x++):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        System.out.println();
        
        x = 10;
        y = x--;
        System.out.println("Prefix-decrement (x = 10, y = --x):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        System.out.println();
        
        x = 10;
        y = x--;
        System.out.println("Postfix-decrement (x = 10, y = x--):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
