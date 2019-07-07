package multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        int arr[] = new int[]{2,3,45,6,7,8,2,3,6,7,8,3,5,8,8,2,3,45,6,7,8,2,3,6,7,8,3,5,8,8,2,3,45,6,7,8,2,3,6,7,8,3,5,8,8
        ,2,3,45,6,7,8,2,3,6,7,8,3,5,8,8,2,3,45,6,7,8,2,3,6,7,8,3,5,8,8,2,3,45,6,7,8,2,3,6,7,8,3,5,8,8};
        SearchTask task = new SearchTask(arr,0,arr.length-1,8);
        Long start = System.currentTimeMillis();
        ForkJoinTask<Integer> submit = pool.submit(task);
        System.out.println(submit.get());
        System.out.println("Total time:"+ (System.currentTimeMillis()-start));
    }
}

class SearchTask extends RecursiveTask<Integer>
{
    private int[] arr;
    private int start;
    private int end;
    private int searchEl;

    public SearchTask(int[] arr, int start, int end, int searchEl) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.searchEl = searchEl;
    }

    /*@Override
    protected Integer compute() {
        return processSearch();
    }*/

    @Override
    protected Integer compute() {
        //System.out.println(Thread.currentThread());
        int size = end - start+1;
        if(size>3)
        {
            int mid = (end+start)/2;
            SearchTask task1 = new SearchTask(arr,start,mid,searchEl);
            SearchTask task2 = new SearchTask(arr,mid+1,end,searchEl);
            task1.fork();
            task2.fork();
            Integer result = task1.join()+task2.join();
            return result;
        }
        else
        {
            return processSearch();

        }
    }

    private Integer processSearch() {
        int count = 0;
        for(int i =start;i<=end;i++)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(arr[i] == searchEl)
                count++;
        }
        return count;
    }
}
