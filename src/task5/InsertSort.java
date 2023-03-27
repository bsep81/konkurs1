package task5;

public class InsertSort {

    public double[] sort(double[] array){
        int length = array.length;
        int index = 0;
        double value = 0;
        for(int i = 1; i < length; i++){
            value = array[i];
            for(int j = i - 1; j >= 0 && array[j] > value; j--){
                array[j + 1] = array[j];
                index = j;
            }
            array[index] = value;
        }

        return array;
    }
}
