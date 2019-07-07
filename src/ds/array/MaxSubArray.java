package ds.array;

public class MaxSubArray {

    public static void main(String[] args) {
        int arr[] ={4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
        findMaxSubArray(arr);
    }

    private static void findMaxSubArray(int[] arr) {

        int max_so_far = arr[0];
        int max_ending_here = 0;
        int s=0,start =0, end =0;

        for(int i=0;i<arr.length;i++)
        {
            max_ending_here+=arr[i];
            if(max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                start = s;
                end =i;
            }
            if(max_ending_here < 0)
            {
                max_ending_here = 0;
                s=i+1;
            }

        }
        System.out.println(start+" "+end);
    }
}
