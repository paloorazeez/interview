package ds.array.sort;

public class MergeSort {

    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6,5 };

        MergeSort ob = new MergeSort();
        ob.mergesort(arr,0,arr.length-1);

        InsertionSort.printArray(arr);
    }

    private void mergesort(int[] arr, int start, int end) {

        if(start < end)
        {
            int mid = (start+end)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    private void merge(int[] arr, int start, int mid, int end) {

        int p = start, q=mid+1, k =0;
        int A[] = new int[end-start+1];

        for(int i= start;i<=end; i++)
        {
            //first half crosses boundary
            if(p>mid)
                A[k++] = arr[q++];
            //second half crosses boundary
            else if(q>end)
                A[k++] = arr[p++];
            else if (arr[p] < arr[q])
                A[k++] = arr[p++];
            else
                A[k++] = arr[q++];
        }

        //copy temporary elements to main array

        for(p =0 ; p<k; p++)
        {
            arr[start++] = A[p];
        }

        //create 2 temp array
        //calculate 2 array size
        /*int n1 = (mid-start)+1;
        int n2 = (end-mid);

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++)
        {
            L[i] = arr[start+i];
        }

        for (int j=0;j<n2;j++)
        {
            R[j] = arr[mid+1+j];
        }

        int i=0, j =0;
        int k=start;

        while(i<n1 && j <n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;

            }
            k++;
        }

        //copy remaining elements to arr
        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }*/
    }
}
