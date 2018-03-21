public class Example1
{
    public static void main(String [] args) {
        labeledBreakStatement();
        System.out.println();
        labeledContinueStatement();
    }
    
    public static void labeledBreakStatement() {
        myBreakLabel:
        while (true) {
            System.out.println("While loop 1");
            while (true) {
                System.out.println("While loop 2");
                while (true) {
                    System.out.println("While loop 3");
                    break myBreakLabel;
                }
            }
        }
    }
    
    public static void labeledContinueStatement() {
        int i = 0;
        myContinueLabel:
        while (true) {
            System.out.println("While loop 1");
            while (true) {
                System.out.println("While loop 2");
                while (true) {
                    System.out.println("While loop 3");
                    i++;
                    if (i == 10)
                        return;
                    continue myContinueLabel;
                    /*while (true) {
                        System.out.println("While lop 4");
                    }*/
                }
            }
        }
    }
}
