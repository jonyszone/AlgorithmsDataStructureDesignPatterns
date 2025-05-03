package algorithmsinjava;

import java.util.Arrays;

import static algorithmsinjava.SelectionSort.swap;

public class QuickSort {
    public static void main(String[] args) {
        //int[] numbers = {7, 3, 3,  -1, 5, 2};
        int[] numbers = {-1};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[]   array){
        sort(array, 0, array.length-1);
    }

    private void sort(int[]   array, int start, int end) {
        //stop recursion
        if (start >= end)
            return;

        //partition
        int boundary = partition(array, start, end);

        //in place left sort
        sort(array, start, boundary-1);

        //in place right sort
        sort(array, boundary+1, end);
    }
    
    private int partition(int [] array, int start, int end) {
        int pivot = array[end];
        int boundary = start -1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot) {
                boundary++;
                swap(array, i, boundary);
            }
        }
        return boundary;
    }
}


