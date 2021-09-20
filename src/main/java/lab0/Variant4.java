package lab0;

public class Variant4 {
    /**
     *
     * @param a is a full section
     * @param b is a part of 'a' section
     * @return the rest of 'a' section
     */

    public int integerNumbersTask(int a, int b) {
        assert a > 0 && b > 0: "Parameters should be positive";
        return a / b;
    }

    /**
     *
     * @param A > 2
     * @param B < 3
     * @return true, if number is positive
     */
    public boolean booleanTask(int A, int B) {
        return A > 2 && B < 3;
    }


    /**
     *
     * @param a, b, c
     * @return amount of positive and negative numbers
     */
    public int ifTask(int a, int b, int c) {
        int temp = 0;
        if (a > 0) temp++;
        if (b > 0) temp++;
        if (c > 0) temp++;
        return temp;
    }


    /**
     *
     * @param ordinalNumber is an ordinal number of month
     * @return amount of days this month has
     */
    public int switchTask(int ordinalNumber) {
        assert ordinalNumber > 0 && ordinalNumber < 13: "Year has only 12 months";
        return Months.byOrdinal2ndWay(ordinalNumber).intGetDays();
    }


    /**
     *
     * @param n is an amount of kilos
     * @return price of total kilos of candies
     */
    public float forTask(int n, float price) {
        assert n > 0: "Argument should be positive";

        float tempPrice = 0;
        for (int i = 0; i < n; i++) tempPrice += price;

        return tempPrice;
    }

    /**
     *
     * @param a is an integer number
     * @return if 'a' is a square of 3
     */
    public boolean whileTask(float a) {
        assert a > -1: "Argument should be zero or positive";
        while (a > 1) a /= 3;
        if (a == 1) return true;
        else return false;
    }

    /**
     *
     * @param array is a set of numbers
     * @return min among all
     */
    public float minMaxTask(float[] array) {
        float min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < min) min = array[i + 1];
        }

        return min;
    }

    /**
     *
     * @param A is a first term of geometric progression
     * @param D is a difference of geometric progression
     * @param N is a size of array which will return
     * @return array of result
     */
    public int[] arrayTask(int A, int D, int N) {
        assert N > 0: "Argument should be positive";
        int[] result = new int[N];
        result[0] = A;

        for (int i = 1; i < N; i++) {
            result[i] = result[i - 1] * D;
        }

        return result;
    }

    /**
     *
     * @param array is an input array of positive integer
     * @param M is a width of output twoDimensionArray
     * @param N is a length of output twoDimensionArray
     * @return twoDimensionArray with input array in each line
     */
    public int[][]  twoDimensionArrayTask(int[] array, int M, int N) {
        assert M > 0 && N > 0: "Argument should be positive";

        int[][] result = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = array[j];
            }
        }

        return result;
    }

    public static void main(String... strings) {
    }
}
