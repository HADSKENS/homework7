public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int i = 0;
        int m = 0;
        while (i < 2459000) {
            i += 15000;
            m += 1;
            System.out.print(m);
            System.out.print(" Сумма накоплений равна " + i);
            System.out.println(" Рублей");
        }
        // Задание 2
        System.out.println("Задание 2");
        int w = 0;
        int f = 9;
        while (w < 10) {
            w += 1;
            System.out.print(" " + w);
        }
        System.out.println();
        for (f = 10; f >= 1; f--) {
            System.out.print(" " + f);
        }
        System.out.println();
        //Задание 3
        System.out.println("Задание 3");
        int year = 0;
        int human = 15000000;
        int count = 0;
        for (year = 0; year <= 10; year++) {
            count = human / 1000;
            human += (count * 17);
            human -= (count * 8);
            System.out.println(year + " Численность населения составляет " + human);
        }
        //Задание 4
        System.out.println("Задание 4");
        double gold = 15000;
        int a = 0;
        while (gold < 12000000) {
            gold = gold + (gold * 0.07);
            i = (int) gold;
            a += 1;
            System.out.println("За " + a + " Месяц(ев), было накоплено " + i + " Рублей");

        }
        //Задание 5
        System.out.println("Задание 5");
        gold = 15000;
        a = 0;
        while (gold < 12000000) {
            gold = gold + (gold * 0.07);
            i = (int) gold;
            a += 1;
            if (a % 6 == 0) {
                System.out.println("За " + a + " Месяц(ев), было накоплено " + i + " Рублей");
            }
        }
        //Задание 6
    }
}