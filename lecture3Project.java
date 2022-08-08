package HomeWorkOfLecture3;

import java.util.Scanner;

public class lecture3Project {
    public static void main(String[] args) {
        System.out.println("----------- First Level -----------");
        firstProblem();
        System.out.println("----------- Second Level -----------");
        secondProblem();
        System.out.println("----------- SecondV2 Level -----------");
        secondProblemV2();
        System.out.println("----------- Third Level -----------");
        thirdProblem();
        System.out.println("----------- Fourth Level -----------");
        fourthProblem();
    }

    private static void firstProblem() {
        int i;
        for (i = 1; i < 101; i++)
            System.out.println(i);
    }

    private static void secondProblem() {
        int a = 2;
        for (int i = 2; i < 52; i += a) {
            System.out.println(i);
        }
    }

    private static void secondProblemV2() {
        int a = 2;
        for (int i = 51; i < 101; i += a) {
            System.out.println(i);
        }
    }

    private static void thirdProblem() {
        int arr[] = new int[]{12, 34, 45, 21, 33, 4, 12, 2, 3, 76};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Array Sum = " + sum);
    }

    private static void fourthProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter  Numbers : ");
        int i = scanner.nextInt();

    }
}
