public class SwitchExample1
{
    private enum ClaimBait {FRESH, SALTED, ARTIFICIAL}
    
    public static void main (String [] args){
        ClaimBait bait = ClaimBait.SALTED;
        
        switch(bait) {
            default:
                System.out.println("No bait");
                break;
            case FRESH:
                System.out.println("Fresh bait");
                break;
            case SALTED:
                System.out.println("Salted bait");
                break;
            case ARTIFICIAL:
                System.out.println("Artificial bait");
                break;
        }
    }
}
