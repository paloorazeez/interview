package ds.array.sort;

public class QuickSort {

    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 6,5 };

        QuickSort ob = new QuickSort();
        ob.quickSort(arr,0,arr.length);

        InsertionSort.printArray(arr);

    }

    private void quickSort(int[] arr, int l, int h) {

        if(l<h)
        {
            int j = partition(arr, l, h);
            quickSort(arr,l,j);
            quickSort(arr,j+1,h);
        }

    }

    private int partition(int[] arr, int l, int h) {

        int pivot = arr[l];
        int i= l, j = h;
        while (i<j)
        {
            do{
                i++;
            }while (i < h && arr[i]<=pivot);

            do{
                j--;
            }while(j>=0 && arr[j] > pivot);

            if(i<j)
                swap(arr, i,j);
        }
        swap(arr, l ,j);
        return j;
    }

    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
