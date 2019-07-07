package ds.array.search;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 4;
        int index = search(arr,0, arr.length, key);
        System.out.println(index);
    }

    public static int search(int[] arr, int low, int high, int key) {
        //check mid element
        if(high < low)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] == key)
            return mid;
        if(key < arr[mid])
            return search(arr,low,mid,key);

        return search(arr,mid+1,high, key);
    }
}
