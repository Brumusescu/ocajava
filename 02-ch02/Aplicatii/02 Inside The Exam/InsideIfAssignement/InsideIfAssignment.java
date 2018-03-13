public class InsideIfAssignment
{
    public static void main(String [] args){
        boolean b;
        boolean bValue = (b = true); // true
        
        if (bValue)
            System.out.println("true");
        else
            System.out.println("false");
        
        if (bValue = false)
            System.out.println("true");
        else
            System.out.println("false");
        
            
        if (bValue == false)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
