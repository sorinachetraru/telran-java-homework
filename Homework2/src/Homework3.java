import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstWord = scanner.nextLine(); // how to check even length?
        System.out.println("Enter second word");
        String secondWord = scanner.nextLine(); // how to check even length?

        String result = returnNewWord(firstWord,secondWord);
        System.out.println(result);

        System.out.println();

        System.out.println("Enter a number");
        float firstNumber = scanner.nextFloat();
        System.out.println("Enter another number");
        float secondNumber = scanner.nextFloat();

        float sum = add(firstNumber,secondNumber);
        float subtraction = subtract(firstNumber,secondNumber);
        float multiply = multiply(firstNumber,secondNumber);
        float division = divide(firstNumber,secondNumber);
        System.out.println("Sum: " + sum);
        System.out.println("Substraction: " + subtraction);
        System.out.println("Multiply: " + multiply);
        System.out.println("Division: " + division);

        System.out.println();

        System.out.println("Enter eur amount");
        float eur = scanner.nextFloat();
        System.out.println("Exchange rate");
        float rate = scanner.nextFloat();
        exchange(eur, rate);

    }

    private static String returnNewWord (String firstWord, String secondWord) {
        String firstHalf = firstWord.substring(0,firstWord.length()/2);
        String secondHalf = secondWord.substring(secondWord.length()/2);
        return firstHalf + secondHalf;
    }

    public static float add (float numberOne, float numberTwo){
        float sum = numberOne + numberTwo;
        return sum;
    }

    public static float subtract (float numberOne, float numberTwo){
        float subtraction = numberOne - numberTwo;
        return subtraction;
    }

    public static float multiply (float numberOne, float numberTwo){
        float multiplication = numberOne * numberTwo;
        return multiplication;
    }


    public static float divide (float numberOne, float numberTwo){
        float division = numberOne / numberTwo;
        return division;
    }

    public static void exchange (float eur, float exchangeRate)
    {
        float usd = eur * exchangeRate;
        System.out.println("при курсе " + exchangeRate + " USD за один EUR, при обмене " + eur + " EUR, вы получте " + usd + " USD");
    }
}
