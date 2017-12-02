
public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 81, 74, 43, 1098, 0 ,8, 92, 17, 754, 912, 0, 6, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.traverse(quickSort.sort(arr, 0, arr.length-1));

    }

}
