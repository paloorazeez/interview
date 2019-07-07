package ds.array.search;
/*
    Given a sorted rotated array find the pair with given SUM
 */
public class PairSum {

    public static void main(String[] args) {
        int arr[] = {11,15,6,8,9,10};
        int sum =16;
        boolean result = findPair(arr,sum);
        System.out.println("Given sum present:"+result);
    }

    private static boolean findPair(int[] arr, int sum) {

        int n = arr.length;
        //find pivot
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]>arr[i+1])
                break;
        }
        //i is the highest value index
        //find lowest value index
        int l = (i+1)%n;
        int r = i;

        /*

         */
        while (l != r)
        {
            if(arr[l]+arr[r] == sum)
                return true;
            if(arr[l]+arr[r] < sum)
            {
                l = (l+1)%n;
            }
            else
            {
                r = (n+r-1)%n;
            }
        }
        return false;
    }
}
