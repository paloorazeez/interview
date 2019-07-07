package ds.array.search;

public class RepetitiveElement {

    public static void main(String[] args) {

        int arr[] = {3,1,2,3,4};
       int result =  findRepetitive(arr);
        System.out.println(result);
    }

    private static int findRepetitive(int[] arr) {
        /*
        sum of n natural nos n*(n+1)/2;
        sum of n-1 natural nos is n*(n-1)/2
        repetitive value = sum of n natural nos - no of n-1 natural nos
         */

        int n = arr.length;
        int nSum = 0;
        for(int i=0;i<n;i++)
            nSum+=arr[i];
        int nMinusOneSum = (n*(n-1))/2;
        return nSum - nMinusOneSum;
    }
}
