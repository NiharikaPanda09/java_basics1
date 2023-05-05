import java.util.*;
public class Recursion {
//   static int  COD(int n) {
//       if (n >= 0 && n <= 9) {
//           return 1;
//       }
//      return COD(n/10) + 1;
//       int SmallAns = SOD(n / 10);
//       int ans = SmallAns + n%10;
//       return SmallAns;

//       static int pow(int  p,int q){
//           if(q==0)
//               return 1;
//           int  SmallAns = pow(p,q/2);
//
//           if(q % 2==0) {
//               return SmallAns * SmallAns;
//           }
//           return  p*SmallAns * SmallAns;
//
//           }

//    static void printMultiple(int n, int k){
//        if(k ==1){
//            System.out.println(n);
//            return;
//        }
//        printMultiple(n,k-1);
//        System.out.println(n * k);
//
//    }
  static  int  ss( int n){
       if(n == 0){
           return 0;
       }
       return ss(n-1) + n;

   }
   static int ss1( int n){
      if(n ==0){
          return 0;
      }
      if(n%2 == 0){
          return ss1(n-1) - n;
      }else{
          return ss1(n-1) + n;
      }
   }
   static int Search (int[] arr,int n,int target, int idx ){
      //base case
       if(idx >= n){
           return -1;
       }
       //self work
       if(arr[idx] == target )
         return idx;

      //recursive work
       return Search(arr,n,target,idx+1);
//       if(Search(arr,n,target,idx+1)){
//           return true;
//       }else{
//           return false;
//       }
   }
   static void Search2(int [] arr,int n, int target, int idx ){
      if(idx >=n){
          return;
      }
      if(arr[idx] == target){
          System.out.println(idx);
      }
      Search2(arr,n,target,idx+1);
   }



    public static void main(String[] args) {
//        System.out.println(COD(4756879));
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        //int k = sc.nextInt();
////        printMultiple(n,k);
//        System.out.println("sum of natural number" +ss1(n));
        int [] arr ={1,2,3,3,7,9,5};
        int target = 3;
        int n = arr.length;
        //System.out.println(Search(arr,n,target,0));
        Search2(arr,n,target,0);



    }
    }

