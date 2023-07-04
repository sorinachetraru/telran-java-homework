public class Homework5 {


    public static void main(String[] args) {
        Task1(65);
        Task2(0);
        Task3(94);
    }

    //Напишите метод, который проверяет, является ли заданное число положительным,
    // отрицательным или нулём и печатает ответ в консоль
    private static void Task1(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is zero");
        }
    }

    //Напишите метод, который определяет, является ли
    // заданное число чётным или нечётным и печатает ответ в консоль
    private static void Task2(int number) {
        if (number % 2 == 0) {
            System.out.println( number + " is even");
        } else {
            System.out.println( number + " is odd");
        }
    }

    //Напишите метод, который определяет оценку студента в зависимости от полученного балла:
    //90-100 - A, 80-89 - B, 70-79 - C, 60-69 - D, меньше 60 - F.
    //Метод принимает число в качестве аргумента и возвращает строку
    private static void Task3 (int grade) {
        if (grade <= 100 && grade >= 90) {
            System.out.println( "You have an A");
        } else if ( grade <= 89 && grade >=80) {
            System.out.println( "You have a B");
        } else if ( grade <= 79 && grade >=70) {
            System.out.println( "You have a C");
        } else if ( grade <= 69 && grade >=60) {
            System.out.println( "You have a D");
        } else {
            System.out.println( "You have an F");
        }
    }
}
