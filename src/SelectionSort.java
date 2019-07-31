import java.util.Arrays;
public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for ( int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = min;
        }
        System.out.println(Arrays.toString(array) + "selectSort");
        return array;
    }
    public static void main(String[] args) {
        stopWatch watch = new stopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        watch.start();
        selectionSort(arr);
        watch.stop();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("time: "+watch.getElapsedTime());
    }
}
