package ds.array.sort;

import java.util.Arrays;

public class AlternativeSort {

    public static void main(String[] args) {
        int arr[] = {1, 12, 4, 6, 7, 10};
        alternateSort(arr);
    }

    private static void alternateSort(int[] arr) {

        Arrays.sort(arr);

        int i =0, j=arr.length-1;
        while(i<j)
        {
            System.out.println(arr[j--]);
            System.out.println(arr[i++]);
        }
    }
}
