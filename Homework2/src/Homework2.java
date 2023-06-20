// работы выполнила Sorina Chetraru

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* мы спрашиваем нашего пользователя:
        сколько коробок вы хотите отправить?*/
        System.out.println("сколько коробок вы хотите отправить?");
        int numberOfPackages = scanner.nextInt();

        /*при помощи сканнера считать количество коробок и и сохранить в переменную определенного типа<
        сколько весит каждая коробка в киллограммах? при помощи сканнера считать вес коробки. Дробное число,
        и сохранить в переменную определенного типа<*/
        System.out.println("сколько весит каждая коробка в киллограммах?");
        double packageWeight = scanner.nextDouble();

        /* Введите имя получателя посылки на этом этапе могут возникнуть ошибки при считывании строки после считвания
        числа, то есть считается пустая строка, проверьте и подумайте, как это решить*/
        System.out.println("Введите имя получателя посылки");
        scanner.nextLine(); // read empty line after Double
        String firstName = scanner.nextLine();

        /*
        Введите фамилию получателя посылки при помощи сканнера считать фамилию получателя <*/
        System.out.println("Введите фамилию получателя посылки");
        String lastName = scanner.nextLine();

        /* Введите адрес получателя посылки при помощи сканнера считать адрес получателя <*/
        System.out.println("Введите адрес получателя посылки");
        String address = scanner.nextLine();

        /* После чего ваш бот должен написать следующее сообщение:
        Получатель: "…"    // подумайте, как распечатать ковычки
        Адрес получателя: "…" // имя и адрес получателя должны быть выведены в верхнем регистре, даже если пользователь
        ввел их в нижнем регистре вес посылки: … кг // вес посылки целиком, а не от дельной коробки, те если было
        3 коробки по 3.5 кг, то вес посылки 10.5 кг*/

        System.out.println();

        System.out.println("Получатель: \"" + firstName.toUpperCase() + " " + lastName.toUpperCase() + "\"" );

        System.out.println("Адрес получателя: \"" + address.toUpperCase()+ "\"" );

        double totalWeight = numberOfPackages * packageWeight;
        System.out.println("вес посылки: " + totalWeight  + "кг" ); // Почему 3 * 3.2кг = 9.600000000000001кг?

        System.out.println();
        System.out.println("Все верно?");

        Boolean allCorrect = scanner.nextBoolean();
    }
}
