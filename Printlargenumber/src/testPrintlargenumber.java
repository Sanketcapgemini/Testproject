import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class testPrintlargenumber {

	@Test
	public void testIfLargeNumberFormed() {
		 ArrayList < Integer > input = new ArrayList < > ();
	        input.add(3);
	        input.add(30);
	        input.add(34);
	        input.add(5);
	        input.add(9);

	        Integer[] ExpectedOutput = {
	            9,
	            5,
	            34,
	            3,
	            30
	        };

	        ArrayList < Integer > Actual = new printlargenumber().printLargestVal(input);
	        Integer[] ActualOutput = Actual.toArray(new Integer[Actual.size()]);


	 
	            assertArrayEquals(ExpectedOutput, ActualOutput);
	       
	}
	
	//Test case 2 : To see if negatives are not accepted.
	@Test
    public void testIfNegativeIntegers() {
        ArrayList < Integer > arr;
        arr = new ArrayList < > ();

        //output should be 9534330
        arr.add(-3);
        arr.add(30);
        arr.add(-34);

       
            assertNull(new printlargenumber().printLargestVal(arr));
        
    }

    //Test case 3 : To see if Strings are not accepted.
	@Test(expected = ClassCastException.class)
    public void testIfStringsNotAccepted() {

        ArrayList inputs = new ArrayList < > ();
        inputs.add("s");
        inputs.add("b");
       
            new printlargenumber().printLargestVal(inputs);

    }


}
