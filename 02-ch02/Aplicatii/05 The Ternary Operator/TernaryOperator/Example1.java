public class Example1
{
    public static void main (String[] args) {
        int x = -5;
        int absoluteValue = x >=0 ? x : -x;
        System.out.println(absoluteValue);
        
        if (x > 0) {
            absoluteValue = x;
        }
        else {
            absoluteValue = -x;
        }
        System.out.println(absoluteValue);
    }
}
