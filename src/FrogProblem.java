public class FrogProblem {
//    static int BestJump(int [] h, int n, int idx){
//        if(idx == n-1) return 0;
//        int op1 = Math.abs(h[idx] - h[idx+1]) + BestJump(h,n,idx+1);
//        if(idx == n-2) return op1;
//        int op2 = Math.abs(h[idx] - h[idx+2]) + BestJump(h,n,idx+2);
//        return Math.min(op1,op2);
//    }
    static void combination(String dig,String[] kp,String result){
        if(dig.length() == 0){
            System.out.println(result + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for(int i =0;i<currChoices.length();i++){
            combination(dig.substring(1),kp,result + currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
//        int [] h = {10,30,40,20};
//        System.out.println(BestJump(h,h.length,0));
        String dig = "253";
        String [] kp ={"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig,kp,"");
    }
}
