
public class Main {
    public static void main(String[] args) {
        int[] arr = { 10, 32, 128, 2345, 23, 1 ,23, 44, 243, 4, 5, 7, 6, 9};
        QuickSort quickSort = new QuickSort();
        quickSort.traverse(quickSort.sort(arr, 0, arr.length-1));

    }

}
