public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Task2");
        for (int i = 10; i >= 1; i = i - 2) {
            System.out.println(i);
        }
        System.out.println("Task3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Task4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Task5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является высокосным");
        }
    }
}