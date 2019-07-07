package ds.array;

public class FindAnElementWithMiinmunComparison {

    public static void main(String[] args) {

        int arr[] = { 4, 6, 1, 5, 8 };
        int n = arr.length;
        int x = 10;
        System.out.println(search(arr, n, x));
    }

    private static boolean search(int[] arr, int n, int x) {

        if(arr[n-1] == x)
            return true;
        int backup = arr[n-1];
        arr[n-1] = x;

        for(int i=0;;i++)
        {
            if(arr[i] == x)
            {
                arr[n-1] = backup;
                if(i<n-1)
                    return true;
                return false;
            }
        }
    }
}
