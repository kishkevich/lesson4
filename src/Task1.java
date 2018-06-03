import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Значение " + (i + 1) + "=" + array[i]);
        }
/*Arrays.sort (array);
        for (int i=0; i<10; i++){
            System.out.println("Новое начение " + (i+1) + "="+ array[i]);
        }*/
        int low = 0;
        int high = array.length - 1;

        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
    }

    /*int partition(int array[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return i;

    }


    void quickSort(int array[], int left, int right) {

        int index = partition(array, left, right);
        if (left < index - 1)
            quickSort(array, left, index - 1);
        if (index < right)
            quickSort(array, index, right);

        System.out.println(Arrays.toString(array));

    }*/
    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }


}


