import java.util.Arrays;

public class BubbleSort {

    /**
     * The bubble sort algorithm works swapping adjacent elements
     * <p>
     * best case O(n²)
     * worst case O(n²)
     * average case O(n²)
     *
     * @param input unsorted array
     * @return sorted array output
     */
    private static int[] sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int aux = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = aux;
                }
            }
        }
        return input;
    }

    /**
     * The bubble sort algorithm works swapping adjacent elements
     * <p>
     * best case O(n)
     * worst case O(n²)
     * average case O(n²)
     *
     * @param input unsorted array
     * @return sorted array output
     */
    private static int[] optimizedSort(int[] input) {
        boolean isSwapped;
        for (int i = 0; i < input.length; i++) {
            isSwapped = false;
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int aux = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = aux;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(BubbleSort.optimizedSort(new int[]{5, 3, 6, 4, 20, 10})));
//        System.out.println(Arrays.toString(BubbleSort.optimizedSort(new int[]{3, 4, 5, 6, 10, 20})));
    }


}
