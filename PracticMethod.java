public class PracticMethod {
    public static void main(String[] args) {
        System.out.println("Начало системы");
        int sumRes = sum(1,2);
        String nameRes = name("Alex");
        System.out.println(sumRes);
        System.out.println(nameRes);

        String [] names = {"Islam"};
        int [] ages = new int[5];
        int[] arr = {3, 6, 9};
        int maxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        System.out.println("max "+maxNumber);
    }
    public static int sum(int a, int b) {
       return a + b;
    }

    public static String name(String name) {
        return name;
    }
}
