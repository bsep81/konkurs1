package Zadanie4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        Random random = new Random();

        for (int i = 10; i <= 100000; i = i * 10) {

            double[] array = new double[i];

            for (int j = 0; j < i; j++) {
                array[j] = random.nextDouble() * 1000;
            }

            double[] array1 = array;
            double[] array2 = array;

            LocalDateTime time1 = LocalDateTime.now();
            bubbleSort.sort(array1);
            LocalDateTime time2 = LocalDateTime.now();
            System.out.print("Dla tablicy o " + i + " elementach czas sortowania przy pomocy bubble sort wynosi: " );
            System.out.println(Duration.between(time1, time2));

            time1 = LocalDateTime.now();
            Arrays.sort(array2);
            time2 = LocalDateTime.now();
            System.out.print("Dla tablicy o " + i + " elementach czas sortowania przy pomocy quick sort wynosi: " );
            System.out.println(Duration.between(time1, time2) + "\n");

        }


    }


}
