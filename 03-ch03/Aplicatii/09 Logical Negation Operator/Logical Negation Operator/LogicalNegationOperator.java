public class LogicalNegationOperator
{
    public static void main(String [] args) {
        System.out.println("true = " + (!false));
        System.out.println("false = " + (!true));
        System.out.println("true = " + (!!true));
        System.out.println("false = " + (!!!true));
        System.out.println("true = " + (!!!!true));
        
        System.out.println();
        int iVar1 = 0;
        int iVar2 = 1;
        if (!(iVar1 <= iVar2)) {
            System.out.println(iVar1 + " > " + iVar2);
        }
        else {
            System.out.println("Expected: " + iVar1 + " <= " + iVar2);
        }
        
        System.out.println();
        boolean bVar1 = false;
        boolean bVar2 = true;
        if ((bVar1 && bVar2) || (! (bVar1 && bVar2))) {
            System.out.println("Expected: true");
        }
        else {
            System.out.println("false");
        }
        
        System.out.println();
        if(!"NAME".equals("NAME")) {
            System.out.println("NAME != NAME");
        }
        else {
            System.out.println("NAME == NAME");
        }
        
        System.out.println();
        String s = "Captain Jack";
        System.out.println("Expected: false" + (! s.startsWith("Captain")));
        
        System.out.println("The next commented lines will end in compile errors due to illegal use");
        //if (!10){}
        //if (!"STRING"){}
    }
}
