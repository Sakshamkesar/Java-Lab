import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Integer[] numbers = {1,2,3,4};
	    List<Integer> numberList = Arrays.asList(numbers);
	    System.out.println("List: " + numberList);
		
		List<Integer> numList = Arrays.asList(4,5,6,7);
		Integer[] numArray = numList.toArray(new Integer[0]);
		System.out.println("Array: " + Arrays.toString(numArray));
	}
}
