import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class sArrayLists {

    static void ReverseArray(ArrayList<Integer> list ) {
        int i =0,j = list.size() - 1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(0);
        list.add(7);
        list.add(10);
        System.out.println("Original array" + list);
        Collections.reverse(list);
        // ReverseArray(list);
        System.out.println("changed array" + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted" + list);


            ArrayList<String> l3 = new ArrayList<>();
            l3.add("welcome");
        l3.add("to");
        l3.add("ANS");
        l3.add("trio");
        System.out.println("original Array" + l3);
       Collections.sort(l3,Collections.reverseOrder());
        System.out.println("Sorted" + l3);



            }
        }


