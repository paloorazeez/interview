package ds.array.search;
/*
array contains repetitive element except 1 element. Find the non-repetitive element
 */
public class UniqueElement {



    public static void main(String[] args) {

        int arr[] = {2,2,3,4,3,5,4};
        int result = findUnique(arr);
        System.out.println("Result is : "+result);
    }

    private static int findUnique(int[] arr) {
        int n =arr.length;
        int result = 0;
        for(int i=0;i<n;i++)
            result=result^arr[i];
        return result;
    }
}
