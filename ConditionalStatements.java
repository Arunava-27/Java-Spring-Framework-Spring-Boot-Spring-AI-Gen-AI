public class ConditionalStatements {
    public static void main(String[] args) {
         int x = 8;
         int y = 8;
         int z = 8;

         if (x>y && x>z) {
            System.out.println("First");
            System.out.println(x);
         } else if (y>z) {
            System.out.println("Second");
            System.out.println(y);
         } else {
            System.out.println("Third");
            System.out.println(z);
         }
    }
}
