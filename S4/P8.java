import java.util.*;
public class Main
{
    public static Map<String, Integer> countFrequencies(List<String> fruits){
        Map<String, Integer> frequency = new HashMap<>();
        
        for (String fruit: fruits){
            if (frequency.containsKey(fruit)){
                frequency.put(fruit, frequency.get(fruit) + 1);
            }else {
                frequency.put(fruit, 1);
            }
        }
        return frequency;
    }
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");
		System.out.println(countFrequencies(fruits));
	}
}
