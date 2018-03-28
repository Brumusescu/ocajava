public class Example1
{
    public static void main(String[] args) {
        boolean b1 = 1 < 2;
        System.out.println("1 < 2 -> " + b1);
        boolean b2 = 3 < 2;
        System.out.println("3 < 2 -> " + b2);
        boolean b3 = 3 > 2;
        System.out.println("3 > 2 -> " + b3);
        boolean b4 = 1 > 2;
        System.out.println("1 > 2 -> " + b4);
        boolean b5 = 2 <= 2;
        System.out.println("2 <= 2 -> " + b5);
        boolean b6 = 3 <= 2;
        System.out.println("3 <= 2 -> " + b6);
        boolean b7 = 3 >= 3;
        System.out.println("3 <= 2 -> " + b7);
        boolean b8 = 2 >= 3;
        System.out.println("3 <= 2 -> " + b8);
        
        boolean b9 = 'A' < 'B';
        System.out.println("Character literals: A < B -> " + b9);
        boolean b10 = '\u0041' < '\u0042';
        System.out.println("Unicode literals: \u0041 < \u0042 -> " + b10);
        boolean b11 = 65 < 66;
        System.out.println("Integer literals that fit in a char: 65 < 66 -> " + b11);
        boolean b12 = '\101' < '\102';
        System.out.println("Octal literals: '\101' < '\102' -> " + b12);
        boolean b13 = 'A' < 0102;
        System.out.println("Character and octal literals: 'A' < '\102' -> " + b13);
        
        boolean b14 = 9.00D < 9.50D;
        System.out.println("Floating points with D postfixes: 9.00D < 9.50D -> " + b14);
        boolean b15 = 9.00d < 9.50d;
        System.out.println("Floating points with d postfixes: 9.00d < 9.50d -> " + b15);
        boolean b16 = 9.00F < 9.50F;
        System.out.println("Floating points with F postfixes: 9.00F < 9.50F -> " + b16);
        boolean b17 = 9.00f < 9.50f;
        System.out.println("Floating points with f postfixes: 9.00f < 9.50f -> " + b17);
        boolean b18 = (double) 9 < (double) 10;
        System.out.println("Integers with specific casts: (double) 9 < (double) 10 -> " + b18);
        boolean b19 = (float) 9 < (float) 10;
        System.out.println("Integers with specific casts: (float) 9 < (float) 10 -> " + b19);
        boolean b20 = 9 < 10;
        System.out.println("Integers that fit into floating points: 9 < 10 -> " + b20);
        boolean b21 = (9 < 10f);
        System.out.println("(9 < 10f) -> " + b21);
        boolean b22 = (float) 11 < 12;
        System.out.println("(float) 11 < 12 -> " + b22);
    }
}
