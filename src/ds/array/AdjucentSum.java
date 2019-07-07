package ds.array;

public class AdjucentSum {

    public static void main(String[] args) {
        //input {3,4,2,1,6} output {6,3,7,9,7}
        int arr[] = {3,4,2,1,6};

        adjucentSum(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    private static void adjucentSum(int[] arr) {

        int first = arr[0];
        int second = arr[1];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(i == n-2)
            {
                arr[i] = arr[i+1]+ first;
            }
            else if(i == n-1)
            {
                arr[i] = first + second;
            }
            else
            {
                arr[i] = arr[i+1]+ arr[i+2];
            }


        }

    }
}
