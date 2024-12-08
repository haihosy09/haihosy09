package ss4_class_and_object.bai_tap;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng 100,000 số ngẫu nhiên
        int[] numbers = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        // Tạo đối tượng StopWatch
        StopWatch stopwatch = new StopWatch();

        // Bắt đầu đo thời gian
        stopwatch.start();
        selectionSort(numbers);
        stopwatch.stop();

        // Hiển thị thời gian thực hiện thuật toán
        System.out.println("Thời gian thực hiện thuật toán Selection Sort: "
                + stopwatch.getElapsedTime() + " ms");
    }

    // Thuật toán Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi giá trị
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

