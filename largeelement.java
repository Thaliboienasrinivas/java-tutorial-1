public class LargestElementInArray {

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};
        int largestNumber = findLargest(numbers);
        System.out.println(largestNumber);
    }
}
