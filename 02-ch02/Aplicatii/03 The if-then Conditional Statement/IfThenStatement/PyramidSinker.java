
public class PyramidSinker
{
    public static void main(String [] args) {
        int pyramidSinker = 3;
        System.out.print("A pyramid sinker that weighs " + pyramidSinker + " ounces is ");
        if (pyramidSinker == 2){
            System.out.println("used for a slow moving tide.");
        }
        else
            if (pyramidSinker == 3) {
                System.out.println("used for a moderate moving tide");
            }
            else
                if (pyramidSinker == 4) {
                    System.out.println("used for a fast moving tide.");
                }
    }
}
