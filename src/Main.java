public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int goal = 2459000;
        int monthSum = 15000;
        int month = 0;
        int totalMoney = 0;
        while (totalMoney < goal) {
            totalMoney = totalMoney + monthSum;
            System.out.println("Месяц " + ++month + ", сумма накоплений равна " + totalMoney + " рублей");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int n = 1;
        while (n <= 10) {
            System.out.print(n++ + " ");
        }
        System.out.println();
        for (int k = 10; k > 0; k--) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int birth = 17;
        int death = 8;
        int year = 0;
        while (year <= 10) {
            System.out.println("Год " + year++ + ", численность населения составляет " + population);
            // population = population + (population / 1000 * birth) - (population / 1000 * death);
            population += population / 1000 * (birth - death);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int goal = 12000000;
        float sum = 15000f;
        float rate = 7 / 100f;
        int month = 0;
        while (sum < goal) {
            System.out.println("Месяц " + month++ + ", сумма накоплений равна " + sum + " рублей");
            sum += sum * rate;

            // Вопрос по этой задаче. Насколько понимаю, у меня все верно, однако сумма на вкладе не достигает 12 млн.
            // 98 месяц - 11 млн с чем-то. В нулевой месяц 15000. Дальше все идет верно. Почему не отображается 99й месяц?
            // Если ставлю while (sum <= goal), ничего не меняется
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int goal = 12000000;
        float sum = 15000;
        float rate = 7 / 100f;
        for (int month = 1; sum < goal; month++) {
            sum += sum * rate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");

                // Не смогла решить через while: не понимаю, куда ткнуть if или чем его заменить.
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int year = 9;
        int monthInYear = year * 12;
        float sum = 15000;
        float rate = 7 / 100f;
        for (int month = 1; month <= monthInYear; month++) {
            sum += sum * rate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");

            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        int daysInMonth = 31;

        for (; friday <= daysInMonth; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cometComesYear = 79;
        int now = 2023;
        int last = now - 200;
        int future = now + 100;

        for (int year = 0; year < future; year += cometComesYear) {
                        if (year > last) {
                System.out.println(year);

            }
        }
    }
}

