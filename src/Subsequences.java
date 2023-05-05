import java.util.*;
public class Subsequences {
//     static ArrayList<String> GetSub(String s){
//         ArrayList<String> ans = new ArrayList<>();
//
//         if(s.length() ==0 ){
//             ans.add("");
//             return ans;
//         }
//
//
//         char cur = s.charAt(0);
//         ArrayList<String> SmallAns = GetSub(s.substring(1));
//         for(String ss: SmallAns){
//             ans.add(ss);
//             ans.add(cur + ss);
//         }
//         return ans;
//     }
//
    static void  PrintSum(int[] a, int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        PrintSum(a,n,idx+1,sum + a[idx]);
        PrintSum(a,n,idx+1,sum);
    }


    public static void main(String[] args) {
       //  PrintSub("abc","");
        int [] a = {2,4,5};
        PrintSum(a,a.length,0,0);
         }

    }

