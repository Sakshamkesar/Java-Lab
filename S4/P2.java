import java.util.*;
public class Main
{
    public static List<Integer> removeElement(List<Integer> numbers, int target){
        List<Integer> result = new ArrayList<>(numbers);
        result.removeIf(n -> n == target);
        return result;
    }
    
	public static void main(String[] args) {
	    List<Integer> numbers = Arrays.asList(1,2,3,2,4,2,5);
	    int target = 2;
		System.out.println(removeElement(numbers, target));
	}
}
