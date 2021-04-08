package practice4;

public class Task4 {
    private Task4() {
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static double sumGeometricElements(int a1, double t, int alim) {
        if (t <= 0 || t >= 1 || a1 <= alim || alim < 0) {
            throw new IllegalArgumentException();
        }
        double element = a1;
        double result = 0;
        while ((element > alim) && (element - alim > 0.01) && (t < 1)) {
            result += element;
            element *= t;
        }
        return Math.round(result);
    }
}
