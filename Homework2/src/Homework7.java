import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {
        System.out.println(numberOfLifts(200, 50,1));
        counter(7);
    }

    private static int numberOfLifts(int floor, int stepUp, int stepDown) {
       int currentFloor = 0;
       int nextFloor;
       int numberOfLifts = 0;

       while (currentFloor < floor) {
           nextFloor = currentFloor + stepUp - stepDown;
           currentFloor = nextFloor;
           numberOfLifts = numberOfLifts + 1;
       }

       return numberOfLifts;
    }



    public static void counter(int n) {
        int gradesA = 0;
        int gradesB = 0;
        int gradesC = 0;
        int gradesD = 0;

        Scanner scanner = new Scanner(System.in);
        int currentStudent = 1;


        while (currentStudent <= n) {
            System.out.println("Enter grade for student " + currentStudent + ":");
            String grade = scanner.nextLine();


            if (grade.equalsIgnoreCase("A")) {
                gradesA = gradesA + 1;
            } else if (grade.equalsIgnoreCase("B")) {
                gradesB = gradesB + 1;
            } else if (grade.equalsIgnoreCase("C")) {
                gradesC = gradesC + 1;
            } else if (grade.equalsIgnoreCase("D")) {
                gradesD++;
            } else {
                System.out.println(grade + " is not a correct grade. Please enter A, B, C or D");
                continue;
            }

            currentStudent = currentStudent +1;
        }


        System.out.println("number of A grades : " + gradesA);
        System.out.println("number of B grades : " + gradesB);
        System.out.println("number of C grades : " + gradesC);
        System.out.println("number of D grades : " + gradesD);
    }

}
