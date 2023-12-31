public class Homework8 {
    public static void main(String[] args) {
        showDivisorOf7();
        showDivisorOf3And5();
        sumPerfectSquares();
        sumSmallerNumbers (6);
        System.out.println(getCharacterFrequency("hello", 'l'));
        System.out.println(romanToDecimal ("XXIV"));
    }

    // Напишите программу, которая выводит на экран все числа от 1 до 100, кратные 7.

    private static void showDivisorOf7() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    // Напишите программу, которая вычисляет сумму всех чисел от 1 до 50,
    // которые делятся на 3 и 5 одновременно.
    private static void showDivisorOf3And5 () {
        int sum = 0;
        for (int i= 1; i<=50; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    //Напишите программу, которая вычисляет сумму всех чисел от 1 до 1000,
    // которые являются точными квадратами.
    //-точный квадрат - квадрат целого числа (4, 9, 16, 25 и тд)

    // solution: https://www.javatpoint.com/java-program-to-check-if-a-given-number-is-perfect-square

    private static void sumPerfectSquares () {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            double sqrt=Math.sqrt(i);
            if ((sqrt - Math.floor(sqrt)) == 0) {
                sum = sum + (int)sqrt;
            }
        }

        System.out.println(sum);
    }

    //Напишите программу, которая принимает число
    // вычисляет сумму всех простых чисел, которые меньше этого числа
    private static void sumSmallerNumbers (int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }

    //Напишите программу, которая принимает строку и символ и возвращает количество вхождений
    // этого символа в строку:
    //"hello", 'l' -> 2
    //"hello", 'e' -> 1
    //"hello", '!' -> 0

    private static int getCharacterFrequency(String text, char character) {
        int frequency = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == character) {
                frequency++;
            }
        }

        return frequency;
    }

    // *simple
    private static int romanToDecimal(String romanNumeral) {
        int prevDecimal = 0;
        int currentDecimal = 0;
        int sum = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentRomanSymbol = romanNumeral.charAt(i);
            currentDecimal = romanSymbolToInt(currentRomanSymbol);

            if (currentDecimal < prevDecimal) {
                sum = sum - currentDecimal;
            } else {
                sum = sum + currentDecimal;
            }

            prevDecimal = currentDecimal;
        }

        return sum;
    }

    private static int romanSymbolToInt(char romanSymbol){
        switch (romanSymbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // ignore invalid symbol
        }
    }
}
