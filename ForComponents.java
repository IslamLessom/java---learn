public class ForComponents {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int b = 0;
        while ( b < 10) {
            System.out.println(b);
            b++;
        }

        do {
            System.out.println("Hiiii");
            b++;
        }while (b < 5);
        System.out.println(isEven(4));
        System.out.println(isEven(7));
    }
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
