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
        System.out.println("Task6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Task7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Task8");
        int gold = 29000;
        for (int i = 1; i <= 12; i = i + 1) {
            System.out.println("Месяц " + i + " сумма накоплений равна " + gold * i + " рублей");
        }
        System.out.println("Task9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            total = total + total / 100;
            System.out.println("Месяц " + i + " cумма годовых накоплений " + total + " рублей");
        }
            System.out.println("Task10");
            int doubl = 2;
            for (int i = 1; i <= 10; i = i + 1) {
                System.out.println(doubl * i);
        }

    }
}