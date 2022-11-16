import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            //System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        System.out.printf("The total amount of expenses per month is %d rubles\n", totalSum);
    }

    public static void task2() {
        System.out.println("\nTask 2");
        int[] arr = generateRandomArray();
        int maxElement = 99_999;
        int minElement = 200_001;

        for (int i = 0; i < arr.length; i++) {
            if(maxElement < arr[i]){
                maxElement = arr[i];
            }
        }
        System.out.printf("The max amount of expenses per month is %d rubles\n", maxElement);

        for (int i = 0; i < arr.length; i++) {
            if(minElement > arr[i]){
                minElement = arr[i];
            }
        }
        System.out.printf("The min amount of expenses per month is %d rubles\n", maxElement);
    }

    public static void task3() {
        System.out.println("\nTask 3");
        int[] arr = generateRandomArray();
        double averageSum = 0.00;
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        averageSum = totalSum / arr.length;
        System.out.printf("The average amount of expenses per month is %.2f rubles\n", averageSum);
    }

    public static void task4() {
        System.out.println("\nTask 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}