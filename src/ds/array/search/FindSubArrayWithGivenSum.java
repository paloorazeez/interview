package ds.array.search;

public class FindSubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int sum = 33;
        findSumInSubArray(arr,sum);

    }

    private static void findSumInSubArray(int[] arr, int sum) {
        int curr_sum = arr[0];
        int start = 0;
        int n = arr.length;
        for(int i=1;i<=n;i++)
        {
            while (curr_sum> sum && start <i-1)
            {
                curr_sum =curr_sum- arr[start];
                start++;
            }
            if(curr_sum == sum)
                System.out.println("Starting index:"+start+" Ending index:"+(i-1));
            if(i<n)
                curr_sum+=arr[i];
        }
    }
}
