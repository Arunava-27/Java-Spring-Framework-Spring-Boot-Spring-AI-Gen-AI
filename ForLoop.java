public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
        }

        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Day " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("   " + (j+8)+" - "+(j+9));
            }
        }
    }
}
