public class QuickSort {

    public int[] sort(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            sort(arr, p, q-1);
            sort(arr, q+1, r);
        }
        return arr;
    }

    public int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p-1;
        for (int j = p; j <= r-1; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }

    public void traverse(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

}
