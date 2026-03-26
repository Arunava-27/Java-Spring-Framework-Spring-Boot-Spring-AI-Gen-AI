public class TypeConversionAndCasting {
    public static void main(String[] args) {
        // Implicit type conversion (widening)
        int num1 = 10;
        double num2 = num1; // int is automatically converted to double
        System.out.println("Implicit Type Conversion: " + num2); // Output: 10.0

        // Explicit type conversion (narrowing)
        double num3 = 9.99;
        int num4 = (int) num3; // double is explicitly cast to int
        System.out.println("Explicit Type Conversion: " + num4); // Output: 9

        // Type promotion in expressions
        byte a = 5;
        byte b = 10;
        int result = a + b; // bytes are promoted to int before addition
        System.out.println("Type Promotion in Expressions: " + result); // Output: 15

        // Casting between incompatible types
        int num5 = 100;
        // char ch = (char) num5; // This would cause a compile-time error
        // To avoid the error, we can cast the int to char
        char ch = (char) num5; // This will convert the integer to its corresponding Unicode character
        System.out.println("Casting between Incompatible Types: " + ch); // Output: 'd' (the character corresponding to Unicode value 100)

        int num6 = 257;
        byte num7 = (byte) num6; // This will cause overflow and wrap around
        System.out.println("Overflow in Type Casting: " + num7); // Output: 1 (because 257 - 256 = 1)

        float num8 = 3.14f;
        int num9 = (int) num8; // This will truncate the decimal part
        System.out.println("Truncation in Type Casting: " + num9); // Output: 3

        // type promotion in mixed-type expressions
        int num10 = 5;
        double num11 = 2.5;
        double result2 = num10 + num11; // int is promoted to double before addition
        System.out.println("Type Promotion in Mixed-Type Expressions: " + result2); // Output: 7.5
    }
}
