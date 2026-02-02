public class HelloWorld {
    public static void main(String[] args) {
        int age = 11;
        age = 18;
        String name = "Islam";
        boolean youStudent = true;

        String result = (age >= 18) ? "Вырос" : "Ребенок";
        System.out.println(result);
        if (age >= 18) {
            System.out.println("Ты уже взрослый");
        }else if (age == 10) {
            System.out.println("дорос до чупа чупса");
        }else if (age == 11) {
            System.out.println("дорос до чипсов");
        }
        System.out.println("мне - " + age);
        System.out.println("меня зовут - " + name);
        System.out.println("Я учусь - " + youStudent);
        System.out.println("Hello world");

    }
}