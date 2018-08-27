

import static org.junit.Assert.*; //

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class printlargenumber {
    //printLargestVal()  Method Implemented against 3 test cases
    static ArrayList < Integer > printLargestVal(ArrayList < Integer > arr) {


     //Condition for negative check added against Test case 2 : 'testIfNegativeIntegers' test case
        for (int num: arr) {
            if (num < 0) { 
                return null;
            }
        }


        //Sorting developed against Test case 1 'testIfLargeNumber Formed' test case
        Collections.sort(arr, new Comparator < Integer > () {
            @Override
            public int compare(Integer X, Integer Y) {

                String XY = Integer.toString(X) + Integer.toString(Y);
                String YX = Integer.toString(Y) + Integer.toString(X);
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        return arr;

    }

    public static void main(String[] args) {

        //Actual User Inputs.We can make changes here as an user
        //Outputs shown on console.
        Iterator it;
        ArrayList < Integer > userinput = new ArrayList < > ();
        userinput.add(10);
        userinput.add(2);
        userinput.add(23);
        userinput.add(5);
       

        it = userinput.iterator();
        System.out.print("User Input : ");
        while (it.hasNext())
            System.out.print(" " + it.next());

        ArrayList < Integer > result = new printlargenumber().printLargestVal(userinput);
        if(result == null){
          System.out.print(" \t Sorting Aborted as one of input value is negative ");  
          return;
        }
        it = result.iterator();
        System.out.print(" \t Highest Number Formed : ");
        while (it.hasNext())
            System.out.print(" " + it.next());

    }


}
