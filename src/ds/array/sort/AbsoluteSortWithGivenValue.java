package ds.array.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AbsoluteSortWithGivenValue {

    public static void main(String[] args) {

        int arr[] = {10,5,3,9,2};
        int x =7;
        absoluteSort(arr,x);
    }

    private static void absoluteSort(int[] arr, int x) {

        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i=0; i<arr.length; i++)
        {
            int key = Math.abs((x-arr[i]));
            List<Integer> list = map.get(key);
            if(list == null)
                list = new ArrayList();
            list.add(arr[i]);
            map.put(key,list);

        }

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet())
        {
            List<Integer> list = entry.getValue();
            System.out.print(list);
        }
    }
}
