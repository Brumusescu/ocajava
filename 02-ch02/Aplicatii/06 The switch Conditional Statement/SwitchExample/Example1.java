public class Example1
{
    public static void main(String[] args) {
        int intValue = 200;
        
        switch (intValue) {
            case 200: 
                System.out.println("Case 1");
                break;
            /* Compiler error: Error: duplicate case label */
            case 200: 
                System.out.println("case 2");
        }
        
        switch (intValue) {
            case 200: 
                System.out.println("Case 1");
            /* Compiler error: Error: duplicate case label */
            case 200: 
                System.out.println("case 2");
        }
    }
}
