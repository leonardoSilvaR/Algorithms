public class BinarySearch {


    private static int search(int[] items, int itemToSearch) {
        int min_position = 0;
        int max_postion = items.length - 1;

        for (int i = min_position; i <= max_postion; i++) {
            int mid = (min_position + max_postion) / 2;
            int midItem = items[mid];
            if (midItem == itemToSearch) {
                return midItem;
            } else if (midItem > itemToSearch) {
                max_postion = mid - 1;
            } else {
                min_position = mid + 1;
            }


        }
        return -1;
    }


    public static void main(String[] args) {
        int[] items = {1, 2, 3, 4, 5};
        System.out.println(BinarySearch.search(items, 6));
    }
}
