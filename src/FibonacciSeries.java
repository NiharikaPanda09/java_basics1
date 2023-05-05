
import java.util.*;
public class FibonacciSeries{
//static int maxArray(int[] arr , int idx){
//    if(idx == arr.length-1){
//        return arr[idx];
//    }
//     int SmallAns = maxArray(arr,idx+1);
//    return Math.max(arr[idx],SmallAns);
//}
    static int ArraySum(int [] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        //subProblem
        int Small = ArraySum(arr,idx+1);

        return Small + arr[idx];
    }

    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9};
       // printArray(arr,0);
        System.out.println(ArraySum(arr,0));
    }
}

