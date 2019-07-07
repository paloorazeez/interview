package ds.array.search;

public class FindElementInRotatedSortedArray {

    public static void main(String[] args) {
        // Let us search 3 in below array
        int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = arr1.length;
        int key = 10;
        System.out.println("Index of the element is : "
                + pivotedBinarySearch(arr1, n, key));

    }

    private static int pivotedBinarySearch(int[] arr1, int n, int key) {
        //1.find pivot
        int pivot = findPivot(arr1,0,n-1);
        if(arr1[pivot] == key)
            return pivot;
        if(pivot == -1)//array is not rotated
            return BinarySearch.search(arr1,0,n-1,key);
        if(key >= arr1[0])
            return BinarySearch.search(arr1,0,pivot,key);
        return BinarySearch.search(arr1,pivot+1,n,key);
    }

    private static int findPivot(int[] arr1, int low, int high) {

        if(low>high)
            return -1;

        if(low == high)
            return low;

        int mid = (low+high)/2;

        if(mid < high && arr1[mid]>arr1[mid+1])
            return mid;

        if(mid > low && arr1[mid] < arr1[mid-1])
            return (mid-1);

        if(arr1[0] >= arr1[mid])
            return findPivot(arr1,low,mid-1);

        return findPivot(arr1,mid+1,high);

    }
}
