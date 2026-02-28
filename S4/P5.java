import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println(Collections.max(numbers) + " is the largest number");
		System.out.println(Collections.min(numbers) + " is th smallest numbers");
	}
}
