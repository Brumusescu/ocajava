public class Example1
{
    public static void main(String[] args) {
        example1();
        example2();
    }
    
    public static void example1() {
        int m;
        
        for (m = 1; m < 5; m++) {
            System.out.println("Marker " + m + ", ");
        }
        System.out.println("Last marker " + m +"\n");
    }
    
    public static void example2() {
        for (int m = 1; m < 5; m++) {
            System.out.println("Marker " + m + ", ");
        }
    }
    
    public static void example3() {
        for(int m = 1; m < 5; m++) {
            System.out.println("Marker " + m + ", ");
        }
        //System.out.println("Last Marker " + m + "\n"); //# Error: variable m not found in class [ClassName].               
    }
}
