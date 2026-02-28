import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,5,3);
		Collections.sort(numbers);
		System.out.println("ascending: " + numbers);
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("descending: " + numbers);
	}
}
