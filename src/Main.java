//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Ex1
        int firstVar = 12;
        System.out.println("Значение переменной firstVar с типом int равно " + firstVar);

        byte secondVar = 12;
        System.out.println("Значение переменной secondVar с типом byte равно " + secondVar);

        short thirdVar = 12;
        System.out.println("Значение переменной thirdVar с типом short равно " + thirdVar);

        long fourthVar = 12L;
        System.out.println("Значение переменной fourthVar с типом long равно " + fourthVar);

        float fifthVar = 12.34f;
        System.out.println("Значение переменной fifthVar с типом float равно " + fifthVar);

        double sixthVar = 12.35;
        System.out.println("Значение переменной sixthVar с типом double равно " + sixthVar);

//Ex2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

//Ex3
        int clLudmilaPav = 23;
        int clAnnaSerge = 27;
        int clEkaterinaAnd = 30;
        int paperTotal = 480;

        float paperForStudent = (float) (paperTotal / (clAnnaSerge + clEkaterinaAnd + clLudmilaPav));

        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги.");

//Ex4
        int bottle2m = 16;

        int bottle20m = bottle2m * 10;
        int bottle24h = bottle2m * 24 * 60 / 2;
        int bottle3d = bottle2m * 3 * 24 * 60 / 2;
        int bottle30d = bottle2m * 30 * 24 * 60 / 2;
        System.out.println("За 20 минут машина произвела " + bottle20m + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottle24h + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottle3d + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottle30d + " штук бутылок.");

//Ex5
        int bothPaint = 120;
        int white = 2;
        int brown = 4;

        int totalClasses = bothPaint / (brown + white);
        int totalWhite = totalClasses * white;
        int totalBrown = totalClasses * brown;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

//Ex6
        int bananaWeight = 80;
        int banana = 5;
        int milkWeight = 105;
        int milk = 2;
        int icecreamWeight = 100;
        int icecream = 2;
        int eggsWeight = 70;
        int eggs = 4;

        int weightGr = banana * bananaWeight + milk * milkWeight + icecream * icecreamWeight + eggs * eggsWeight;
        float weightKg = weightGr / (float)1000;

        System.out.println("Вес завтрака в граммах: " + weightGr);
        System.out.println("Вес завтрака в килограммах: " + weightKg);

//Ex7
        int target = 7;
        float weightLoss1 = 0.25f;
        float weightLoss2 = 0.5f;

        float days1 = target / weightLoss1;
        float days2 = target / weightLoss2;
        float daysAverage = target / ((weightLoss1 + weightLoss2) / 2);

        System.out.println("Спортсмен будет худеть " + days1 + " дней, теряя по " + weightLoss1 + " килограмм в день, и "+ days2 + " дней, теряя по " + weightLoss2 + " килограмм");
        System.out.println("В среднем потребуется " + daysAverage + " дней");

//Ex8
        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;

        float mashaNew = (float)(masha + masha * 0.1);
        float denisNew = (float)(denis + denis * 0.1);
        float cristinaNew = (float)(cristina + cristina * 0.1);

        float mashaDif = mashaNew * 12 - masha * 12;
        float denisDif = denisNew * 12 - denis * 12;
        float cristinaDif = cristinaNew * 12 - cristina * 12;

        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDif + " рублей");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDif + " рублей");
        System.out.println("Кристина теперь получает " + cristinaNew + " рублей. Годовой доход вырос на " + cristinaDif + " рублей");
    }
}