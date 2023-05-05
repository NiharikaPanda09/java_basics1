import java.util.ArrayList;
import java.util.Collections;
public class List {
   static void bucketSort(float[] arr){
       int n= arr.length;
       //int[] a = new int[5];
       ArrayList<Float> [] buckets = new ArrayList[n];
       for(int i=0;i<n;i++){
           buckets[i] = new ArrayList<Float>();
       }
       for(int i=0;i<n;i++){
           int bucketIdx = (int) arr[i] * n;
           buckets[bucketIdx].add(arr[i]);
       }
       for(int i=0; i< buckets.length;i++){
           Collections.sort(buckets[i]);
       }
       int index =0;
       for(int i=0;i< buckets.length;i++){
           ArrayList<Float> currBucket = buckets[i];
           for(int j=0; j<currBucket.size();j++){
               arr[index] = currBucket.get(j);
           }
       }
   }

//    static ArrayList<Integer> FindAllIndices(int[] arr, int n , int target, int idx){
//        if(idx >= n){
//            return new ArrayList<Integer>();
//        }
//        ArrayList<Integer> ans = new ArrayList<>();
//        if(arr[idx] == target){
//            ans.add(idx);
//        }
//       ArrayList<Integer> smallAns= FindAllIndices(arr,n,target,idx+1);
//        ans.addAll(smallAns);
//        return ans;
//    }
    public static void main(String[] args) {
        float[] arr = {0.5f,0.4f,0.3f,0.2f,0.1f};
      bucketSort(arr);
       for(float val: arr){
           System.out.println(val + " ");
       }
    }
}

