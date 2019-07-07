package ds.array.sort;

public class WaveSort {

    public static void main(String[] args) {

        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        //output: 10 90 2 49 1 5 23
        int n = arr.length;
        sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i+" ");


    }

    private static void sortInWave(int[] arr, int n) {
        //loop through even elements
        for(int i=1; i<n-1; i+=2)
        {

            //check current element smaller than previous element. if yes swap
            if(i > 0 && arr[i-1]>arr[i])
                swap(arr,i-1,i);
            //check current element smaller than next element. if yes swap
            if(i<n-2 && arr[i]<arr[i+1])
                swap(arr,i,i+1);
        }
    }

    private static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
