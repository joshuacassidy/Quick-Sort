public class QuickSort<T extends Comparable<T>> {

    private T[] arr;

    public QuickSort(T[] arr) {
        this.arr = arr;
    }

    public T[] sort(int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            sort(p, q-1);
            sort(q+1, r);
        }
        return arr;
    }

    public int partition(T[] arr, int p, int r) {
        T pivot = arr[r];
        int i = p-1;
        for (int j = p; j <= r-1; j++) {
            if(arr[j].compareTo(pivot) <= 0) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }

    public void swap(T[] arr, int x, int y) {
        T temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void traverse(T[] arr) {
        for (T i: arr) {
            System.out.print(i + " ");
        }
    }

}
