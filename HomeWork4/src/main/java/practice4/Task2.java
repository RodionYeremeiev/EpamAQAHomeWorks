package practice4;

public class Task2 {
    private Task2() {
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int[] transform(int[] array, SortOrder order) {
        if (array == null || order == null || array.length == 0 ) {
            throw new IllegalArgumentException();
        }
        if (Task1.isSorted(array, order)) {
            for (int i = 0; i < array.length; i++) {
                array[i] += i;
            }
        }
        return array;
    }
}
