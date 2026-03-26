public class LiteralsDemo {
    public static void main(String args[])
    {
        // literals
        int age = 30; // integer literal
        double pi = 3.14159; // double literal
        char grade = 'A'; // character literal  
        String name = "John"; // string literal
        boolean isStudent = true; // boolean literal

        // binary literals
        int binaryValue = 0b1010; // binary literal for 10 in decimal
        // octal literals
        int octalValue = 012; // octal literal for 10 in decimal
        // hexadecimal literals
        int hexValue = 0xA; // hexadecimal literal for 10 in decimal

        // printing the literals
        System.out.println("Age: " + age);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Binary Value: " + binaryValue);
        System.out.println("Octal Value: " + octalValue);
        System.out.println("Hexadecimal Value: " + hexValue);

        int largeNumber = 1_000_000; // using underscores for readability
        System.out.println("Large Number: " + largeNumber);
    }
}
