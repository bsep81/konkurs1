package Zadanie5;

import Zadanie4.BubbleSort;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        InsertSort insertSort = new InsertSort();
        Random random = new Random();

        for (int i = 10; i <= 100000; i = i * 10) {


            double[] array1 = new double[i];
            double[] array2 = new double[i];
            double[] array3 = new double[i];

            for (int j = 0; j < i; j++) {
                double number = random.nextDouble() * 1000;
                array1[j] = number;
                array2[j] = number;
                array3[j] = number;
            }



            LocalDateTime time1 = LocalDateTime.now();
            bubbleSort.sort(array1);
            LocalDateTime time2 = LocalDateTime.now();
            System.out.print("Dla tablicy o " + i + " elementach czas sortowania przy pomocy bubble sort wynosi: " );
            System.out.println(Duration.between(time1, time2));

            time1 = LocalDateTime.now();
            insertSort.sort(array2);
            time2 = LocalDateTime.now();
            System.out.print("Dla tablicy o " + i + " elementach czas sortowania przy pomocy insert sort wynosi: " );
            System.out.println(Duration.between(time1, time2));

            time1 = LocalDateTime.now();
            Arrays.sort(array3);
            time2 = LocalDateTime.now();
            System.out.print("Dla tablicy o " + i + " elementach czas sortowania przy pomocy quick sort wynosi: " );
            System.out.println(Duration.between(time1, time2) + "\n");

        }

    }
}
