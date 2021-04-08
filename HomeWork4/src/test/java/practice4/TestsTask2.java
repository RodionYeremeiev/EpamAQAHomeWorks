package practice4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask2 {
    int[] sortedAscendingShort = {3, 10, 15};
    int[] sortedDescendingShort = {15, 10, 3};
    int[] sortedAscendingLong = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] sortedDescendingLong = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    int[] notSortedShort = {43, 0, 267};
    int[] notSortedLong = {9, 43, 5, 11, 0, 267, 29, 3, 1, 66};
    int[] emptyArray = new int[0];
    int[] transformedShortASC = {3, 11, 17};
    int[] transformedShortDESC = {15, 11, 5};
    int[] transformedLongASC = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
    int[] transformedLongDESC = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};



    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testForIllegalArgument() {
        Task2.transform(emptyArray, SortOrder.ASC);
        Task2.transform(emptyArray, SortOrder.DESC);
        Task2.transform(sortedAscendingShort, null);
        Task2.transform(sortedDescendingShort, null);
        Task2.transform(sortedAscendingLong, null);
        Task2.transform(sortedDescendingLong, null);
        Task2.transform(notSortedShort, null);
        Task2.transform(notSortedLong, null);
        Task2.transform(null, null);
        Task2.transform(null, SortOrder.ASC);
        Task2.transform(null, SortOrder.DESC);
        Task2.transform(emptyArray, null);
        Task2.transform(null, null);
    }

    @Test
    public void testForSortedAscending() {
        Assert.assertEquals(transformedShortASC, Task2.transform(sortedAscendingShort, SortOrder.ASC), "array is sorted in ascending order, sort order parameter ASC");
        Assert.assertEquals(sortedAscendingShort, Task2.transform(sortedAscendingShort, SortOrder.DESC), "array is sorted in ascending order, sort order parameter DESC");
        Assert.assertEquals(transformedLongASC, Task2.transform(sortedAscendingLong, SortOrder.ASC), "array is sorted in ascending order, sort order parameter ASC");
        Assert.assertEquals(sortedAscendingLong, Task2.transform(sortedAscendingLong, SortOrder.DESC), "array is sorted in ascending order, sort order parameter DESC");

    }

    @Test
    public void testForSortedDescending() {
        Assert.assertEquals(sortedDescendingShort, Task2.transform(sortedDescendingShort, SortOrder.ASC), "array is sorted in descending order, sort order parameter ASC");
        Assert.assertEquals(transformedShortDESC, Task2.transform(sortedDescendingShort, SortOrder.DESC), "array is sorted in descending order, sort order parameter DESC");
        Assert.assertEquals(sortedDescendingLong, Task2.transform(sortedDescendingLong, SortOrder.ASC), "array is sorted in descending order, sort order parameter ASC");
        Assert.assertEquals(transformedLongDESC, Task2.transform(sortedDescendingLong, SortOrder.DESC), "array is sorted in descending order, sort order parameter DESC");
    }

    @Test
    public void testForNotSorted(){
        Assert.assertEquals(notSortedShort,Task2.transform(notSortedShort,SortOrder.ASC),"array is not sorted, sort order parameter ASC");
        Assert.assertEquals(notSortedShort,Task2.transform(notSortedShort,SortOrder.DESC),"array is not sorted, sort order parameter DESC");
        Assert.assertEquals(notSortedLong,Task2.transform(notSortedLong,SortOrder.ASC),"array is not sorted, sort order parameter ASC");
        Assert.assertEquals(notSortedLong,Task2.transform(notSortedLong,SortOrder.DESC),"array is not sorted, sort order parameter DESC");
    }
}
