package ds.array;

public class ArrayRotation {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        //arr = rotateLeft(arr,2);
        arr = rotateRight(arr,2);
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    private static int[] rotateRight(int[] arr, int d) {

        if(d > arr.length)
            d = arr.length % d;
        //create temp arr
        int temp[] = new int[d];
        int j =0;
        for( int i= arr.length-d;i<arr.length;i++)
        {
            temp[j++] = arr[i];
        }
        //right shift arr
        for(int i = arr.length-d-1; i>=0; i--)
        {
            arr[i+d] = arr[i];
        }
        //join temp
        for(int i=0;i<d;i++)
        {
            arr[i] = temp[i];
        }
        return arr;
    }

    private static int[] rotateLeft(int[] arr, int d) {
        if(d>arr.length)
            d = arr.length % d;

        int temp[] = new int[d];
        //create temp array
        for (int i =0;i<d;i++)
            temp[i] = arr[i];

        //shift other elements left
        for(int i = d;i<arr.length;i++)
        {
            arr[i-d] = arr[i];
        }
        //add temp arr at the end
        int j=0;
        for(int i=arr.length-d;i<arr.length;i++)
        {
            arr[i] = temp[j++];
        }

        return arr;
    }
}
