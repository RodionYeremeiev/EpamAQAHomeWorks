package practice4;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask1 {

    int[] sortedAscendingShort = {3, 10, 15};
    int[] sortedDescendingShort = {15, 10, 3};
    int[] sortedAscendingLong = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] sortedDescendingLong = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    int[] notSortedShort = {43, 0, 267};
    int[] notSortedLong = {9, 43, 5, 11, 0, 267, 29, 3, 1, 66};
    int[] emptyArray = new int[0];


    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testForIllegalArgument() {
        Task1.isSorted(emptyArray, SortOrder.ASC);
        Task1.isSorted(emptyArray, SortOrder.DESC);
        Task1.isSorted(sortedAscendingShort, null);
        Task1.isSorted(sortedDescendingShort, null);
        Task1.isSorted(sortedAscendingLong, null);
        Task1.isSorted(sortedDescendingLong, null);
        Task1.isSorted(notSortedShort, null);
        Task1.isSorted(notSortedLong, null);
        Task1.isSorted(null, null);
        Task1.isSorted(null, SortOrder.ASC);
        Task1.isSorted(null, SortOrder.DESC);
        Task1.isSorted(emptyArray, null);
        Task1.isSorted(null, null);
    }

    @Test
    public void testWithSortedArrayAscending() {
        Assert.assertTrue(Task1.isSorted(sortedAscendingShort, SortOrder.ASC), "array is sorted in ascending order, sort order parameter ASC");
        Assert.assertFalse(Task1.isSorted(sortedAscendingShort, SortOrder.DESC), "array is sorted in ascending order, sort order parameter DESC");
        Assert.assertTrue(Task1.isSorted(sortedAscendingLong, SortOrder.ASC), "array is sorted in ascending order, sort order parameter ASC");
        Assert.assertFalse(Task1.isSorted(sortedAscendingLong, SortOrder.DESC), "array is sorted in ascending order, sort order parameter DESC");
    }

    @Test
    public void testWithSortedArrayDescending() {
        Assert.assertTrue(Task1.isSorted(sortedDescendingShort, SortOrder.DESC), "array is sorted in descending order, sort order parameter DESC");
        Assert.assertFalse(Task1.isSorted(sortedDescendingShort, SortOrder.ASC), "array is sorted in descending order, sort order parameter ASC");
        Assert.assertTrue(Task1.isSorted(sortedDescendingLong, SortOrder.DESC), "array is sorted in descending order, sort order parameter DESC");
        Assert.assertFalse(Task1.isSorted(sortedDescendingLong, SortOrder.ASC), "array is sorted in descending order, sort order parameter ASC");
    }

    @Test
    public void testWithNotSortedArray() {
        Assert.assertFalse(Task1.isSorted(notSortedShort, SortOrder.ASC), "array is not sorted, sorting order ASC");
        Assert.assertFalse(Task1.isSorted(notSortedLong, SortOrder.ASC), "array is not sorted, sorting order ASC");
        Assert.assertFalse(Task1.isSorted(notSortedShort, SortOrder.DESC), "array is not sorted, sorting order DESC");
        Assert.assertFalse(Task1.isSorted(notSortedLong, SortOrder.DESC), "array is not sorted, sorting order DESC");
    }

}
