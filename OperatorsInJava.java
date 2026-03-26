public class OperatorsInJava {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // Output: 15
        System.out.println("Subtraction: " + (a - b)); // Output: 5
        System.out.println("Multiplication: " + (a * b)); // Output:
        System.out.println("Division: " + (a / b)); // Output: 2
        System.out.println("Modulus: " + (a % b)); // Output: 0


        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // Output: false
        System.out.println("Not equal to: " + (a != b)); // Output: true
        System.out.println("Greater than: " + (a > b)); // Output: true
        System.out.println("Less than: " + (a < b)); // Output: false
        System.out.println("Greater than or equal to: " + (a >= b)); // Output: true
        System.out.println("Less than or equal to: " + (a <= b)); // Output: false


        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // Output: false    
        System.out.println("Logical OR: " + (x || y)); // Output: true
        System.out.println("Logical NOT: " + (!x)); // Output: false

        // Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("Addition Assignment: " + c); // Output: 15
        c -= 3; // c = c - 3
        System.out.println("Subtraction Assignment: " + c); // Output: 12   
        c *= 2; // c = c * 2
        System.out.println("Multiplication Assignment: " + c); // Output: 24
        c /= 2; // c = c / 2
        System.out.println("Division Assignment: " + c); // Output: 12
        c %= 5; // c = c % 5
        System.out.println("Modulus Assignment: " + c); // Output: 2
           

        // Increment and Decrement Operators
        int d = 5;
        System.out.println("Post-increment: " + (d++)); // Output: 5 (d becomes 6 after this line)
        System.out.println("Pre-increment: " + (++d)); // Output: 7
        System.out.println("Post-decrement: " + (d--)); // Output: 7 (d becomes 6 after this line)
        System.out.println("Pre-decrement: " + (--d)); // Output: 5


        // Ternary Operator
        int e = 10;
        String result = (e > 5) ? "Greater than 5" : "Less than or equal to 5";
        System.out.println("Ternary Operator Result: " + result); // Output: Greater than 5


        
        // Bitwise Operators
        int f = 5; // In binary: 0101
        int g = 3; // In binary: 0011
        System.out.println("Bitwise AND: " + (f & g)); // Output: 1 (In binary: 0001)
        System.out.println("Bitwise OR: " + (f | g)); // Output: 7 (In binary: 0111)
        System.out.println("Bitwise XOR: " + (f ^ g)); // Output: 6 (In binary: 0110)
        System.out.println("Bitwise NOT: " + (~f)); // Output: -6 (In binary: 1010, which is -6 in two's complement)
        System.out.println("Left Shift: " + (f << 1)); // Output: 10 (In binary: 1010)
        System.out.println("Right Shift: " + (f >> 1)); // Output: 2 (In binary: 0010)  
        System.out.println("Unsigned Right Shift: " + (f >>> 1)); // Output: 2 (In binary: 0010)
    }
}
