import org.junit.Assert;
import org.junit.Test;


public class QuickSortTest<T extends Comparable<T>> {

    @Test
    public void sortIntegers() throws Exception {
        Integer[] arr = new Integer[]{10, 32, 128, 2345, 23, 1, 23, 44, 243, 4, 5, 7, 6, 9};
        Assert.assertArrayEquals(new QuickSort<>(arr).sort(0, arr.length - 1), new Integer[]{1, 4, 5, 6, 7, 9, 10, 23, 23, 32, 44, 128, 243, 2345});
    }

    @Test
    public void sortStrings() throws Exception {
        String[] arr = new String[]{"Josh", "John", "Harry", "Henry", "Harvey"};
        Assert.assertArrayEquals(new QuickSort<>(arr).sort(0, arr.length - 1), new String[]{"Harry", "Harvey", "Henry", "John", "Josh"});
    }

    @Test
    public void sortChars() throws Exception {
        Character[] arr = new Character[]{'d', 'c', 'b', 'a', 'e'};
        Assert.assertArrayEquals(new QuickSort<>(arr).sort(0, arr.length - 1), new Character[]{'a', 'b', 'c', 'd', 'e'});
    }

    @Test
    public void sortDoubles() throws Exception {
        Double[] arr = new Double[]{10.8, 32.3, 128.2, 2345.3, 23.5, 1.1, 23.3, 44.0, 243.0, 4.0, 5.0, 7.0, 6.0, 9.0};
        Assert.assertArrayEquals(new QuickSort<>(arr).sort(0, arr.length - 1), new Double[]{1.1, 4.0, 5.0, 6.0, 7.0, 9.0, 10.8, 23.3, 23.5, 32.3, 44.0, 128.2, 243.0, 2345.3});
    }

    @Test
    public void sortLong() throws Exception {
        Long[] arr = new Long[]{10L, 32L, 128L, 2345L, 23L, 1L, 23L, 44L, 243L, 4L, 5L, 7L, 6L, 9L};
        Assert.assertArrayEquals(new QuickSort<>(arr).sort(0, arr.length - 1), new Long[]{1L, 4L, 5L, 6L, 7L, 9L, 10L, 23L, 23L, 32L, 44L, 128L, 243L, 2345L});
    }

}