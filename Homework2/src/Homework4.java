import java.util.Random;

public class Homework4 {

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
    }

    private static void Task1() {
        boolean isRain = false;
        boolean isWeekend = true;
        boolean canWalk = isRain == false && isWeekend == true;
        System.out.println(canWalk);
    }

    private static void Task2() {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Я могу купить еду, это " + canBuy);
    }

    private static void Task3() {
        int temperature1 = 100;
        int temperature2 = 100;
        boolean isWorking = temperature1 > 100   && temperature2 < 100;

        System.out.println(isWorking);
    }

    private static void Task4() {
        Random random = new Random();
        int n = random.nextInt(0,28800);

        System.out.println("осталось " + n + " секунд");

        int hours = n/3600;
        System.out.println("осталось " + hours + " час/а/ов");
    }
}
