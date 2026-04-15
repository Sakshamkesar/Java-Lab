public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index accessed. " + e.getMessage());
        }
    }
}