public class Exercise {
  public static void main(String[] args) {

    double num1 = 7;
    double num2 = 3;
    char operator = '+';
    String again = "y";

    while (again == "y") {
      if (operator == '+') {
        System.out.println("Result: "+(num1 + num2));
        again = "n";
      } else if (operator == '-') {
        System.out.println("Result: "+(num1 - num2));
        again = "n";
      } else if (operator == '*') {
        System.out.println("Result: "+(num1 * num2));
        again = "n";
      } else if (operator == '/') {
        if (num2 == 0) {
          System.out.println("Cannot divide by zero.");
          again = "n";
        } else {
          System.out.println("Result: "+(num1 / num2));
          again = "n";
        }
      } else {
        System.out.println("Invalid Operator");
      }
    }

    System.out.println("Thank you for using the calculator.");

  }
}
