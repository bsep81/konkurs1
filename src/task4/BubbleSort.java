package task4;

public class BubbleSort {

    public double[] sort(double[] array) {
        int length = array.length;
        double temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j +1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
