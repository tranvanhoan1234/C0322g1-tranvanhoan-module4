public class Demo {
    public static void main(String[] args) {
        int a = 7;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == a)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

