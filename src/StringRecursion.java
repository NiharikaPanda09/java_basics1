import java.util.*;
public class StringRecursion {
    //    static String RemoveString(String s) {
//
//        if (s.length() == 0) return "";
//
//        String SmallAns = RemoveString(s.substring(1));
//        char curr = s.charAt(0);
//
//        if (curr != 'a') {
//            return curr + SmallAns;
//        } else {
//            return SmallAns;
//        }
//    }
//    static String RemoveA(String s , int idx){
//
//        if(idx == s.length()) return "";
//
//        String SmallAns = RemoveA(s,idx+1);
//        char curr = s.charAt(idx);
//
//        if(curr != 'a'){
//          return curr + SmallAns;
//        }else{
//            return SmallAns;
//        }
//
//    }
    static String ReverseString(String s, int idx) {
        if (idx == s.length()) return "";
        String SmallAns = ReverseString(s, idx + 1);
        return SmallAns + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //System.out.println(ReverseString(s,0));
        String rev = ReverseString(s, 0);
        if (rev.equals(s)) {
            System.out.printf(" %s is palindromic", s);
        }
        else {
            System.out.printf(" %s is not palindromic", s);
        }


        }
    }


