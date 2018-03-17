public class Exercise2_1
{
    public static void main(String[] args){
        intSwitchExample(5);
        intSwitchExample(2);
        
        charSwitchExample('b');
        charSwitchExample('x');
        
        byteSwitchExample((byte)120);
        byteSwitchExample((byte)100);
    }
    
    public static void intSwitchExample(int val) {
        switch(val){
            case 0:
                System.out.println("int example: 0");
                break;
            case 1:
                System.out.println("int example: 1");
                break;
            default:
                System.out.println("int example: not 0, 1, 2");
                break;
            case 2:
                System.out.println("int example: 2");
                break;
        }
        System.out.println();
    }
    
    public static void charSwitchExample(char val) {
        switch(val) {
            case 'a':
                System.out.println("char example: a");
            default:
                System.out.println("char example: not a, b");
            case 'b':
                System.out.println("char example: b");
        }
        System.out.println();
    }
    
    public static void byteSwitchExample(byte val) {
        switch(val) {
            default:
                System.out.println("byte example: any");
                break;
            case 0:
                System.out.println("byte example: 0");
                break;
            case 1:
                System.out.println("byte example: 1");
                break;
            case 2:
                System.out.println("byte example: 2");
                break;
            case 100:
                System.out.println("byte example: 100");
                break;
            case 127:
                System.out.println("byte example: 127");
                break;
        }
    }
    
    
}
