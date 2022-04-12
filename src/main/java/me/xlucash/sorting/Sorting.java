package me.xlucash.sorting;

public class Sorting {
    public static void bubbleSort(int[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            for(int j = i+1; j<array.length; j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            int j = i;
            var temp = array[j];
            while (j>0 && array[j-1]>temp)
            {
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }

    public static void quickSort(int[] array) {
        recursiveQuickSort(array, 0, array.length - 1);
    }
    private static int partition(int[] array, int left, int right) {
        int pivot = array[left];

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                left++;
                right--;
            }
        }
        return left;
    }

    public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) {

        int idx = partition(array, startIdx, endIdx);

        if (startIdx < idx - 1) {
            recursiveQuickSort(array, startIdx, idx - 1);
        }

        if (endIdx > idx) {
            recursiveQuickSort(array, idx, endIdx);
        }
    }
}
