public class Exercise_3_1
{
    public static void main(String [] args) {
        byte a;
        a = 10;
        System.out.println("Expected 13, Have: " + (a += 3));
        System.out.println("Expected 13, Have: " + a);
        a = 15;
        System.out.println("Expected 12, Have: " + (a -= 3));
        System.out.println("Expected 12, Have: " + a);
        a = 20;
        System.out.println("Expected 60, Have: " + (a *= 3));
        System.out.println("Expected 60, Have: " + a);
        a = 25;
        System.out.println("Expected 8, Have: " + (a /= 3));
        System.out.println("Expected 8, Have: " + a);
        a = 30;
        System.out.println("Expected 0, Have: " + (a %= 3));
        System.out.println("Expected 0, Have: " + a);
        a = 35;
        System.out.println("35 = 1 0 0 0 1 1 AND");
        System.out.println("   = 0 0 0 0 1 1");
        System.out.println("---------------------");
        System.out.println("3  = 0 0 0 0 1 1");
        System.out.println("Expected 3, Have: " + (a &= 3));
        System.out.println("Expected 3, Have: " + a);
        a = 40;
        System.out.println("a = 40 * 40 * 40 = 6400");
        System.out.println("Expected 64000 - error, Have: " + (a ^= 3));
        System.out.println("Expected 64000 - error, Have: " + a);
        a = 45;
        System.out.println("45 = 1 0 1 1 0 1 OR");
        System.out.println("3  = 0 0 0 0 1 1");
        System.out.println("-------------------");
        System.out.println("47 = 1 0 1 1 1 1");
        System.out.println("Expected 47, Have: " + (a |= 3));
        System.out.println("Expected 47, Have: " + a);
        a = 50;
        System.out.println("50 = 1 1 0 0 1 0  << 3");
        System.out.println("----------------------");
        System.out.println("22 = 0 1 0 1 1 0");
        System.out.println("Expected 22, Have: " + (a <<= 3));
        System.out.println("Expected 22, Have: " + a);
        a = 55;
        System.out.println("55 = 1 1 0 1 1 1 >>3");
        System.out.println("--------------------");
        System.out.println("62 = 1 1 1 1 1 0");
        System.out.println("Expected 62, Have: " + (a >>= 3));
        System.out.println("Expected 62, Have: " + a);
        a = 60;
        System.out.println("Expected ?, Have: " + (a >>>= 3));
        System.out.println("Expected ?, Have: " + a);
    }
}
