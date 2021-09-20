package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Variant4Test {

    public final float price = 46.73f;
    public int A, D;

    ////////////////////////////////////////////////

    @Test(dataProvider = "integerProvider")
    public void inputTest(int p1, int p2, int expected) {
        assertEquals(new Variant4().integerNumbersTask(p1, p2), expected);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 7, 5, 1}, { 23, 11, 2}, { 50, 7, 7} };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeIntegerTest() {
        new Variant4().integerNumbersTask(-4, 3);
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int p4, int expected) {
        assertEquals(new Variant4().ifTask(p1, p2, p4), expected);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { {2, 3, 10, 3}, {0, 0, 0, 0}, { -3, -3, -1, 0} };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, boolean p3) {
        assertEquals(new Variant4().booleanTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { { 5, 1,  true }, { 0, -2, false }, { 3, 4, false } };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(int p1, int expected) {
        assertEquals(new Variant4().switchTask(p1), expected);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { { 3, 31}, {2, 28}, {6, 30}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void switchLessTest() {
        new Variant4().switchTask(0);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void switchOverTest() {
        new Variant4().switchTask(13);
    }
    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")

    public void forTest(int n, float expected) {
        assertEquals(new Variant4().forTask(n, price), expected);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] { {2, 93.46f}, { 3, 140.19f}, { 7, 327.11002f} };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeForTest() {
        new Variant4().forTask(-2, price);
    }

    //////////////////////////////////////////

    @Test(dataProvider = "whileProvider")
    public void whileTest(float a, boolean expected) {
        assertEquals(new Variant4().whileTask(a), expected);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { {3, true}, {27, true}, {81, true}, {82, false}, {0, false}};
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeWhileProvider")
    public void negativeWhileTest(float a) {
        new Variant4().whileTask(a);
    }

    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][] {{-7}, {-2}, {-3}};
    }

    //////////////////////////////////////////
    @Test(dataProvider = "minMaxProvider")
    public void minMaxTest(float[] array, float expected) {
        assertEquals(new Variant4().minMaxTask(array), expected);
    }

    @DataProvider
    public Object[][] minMaxProvider() {
        return new Object[][] { { new float[] {-34.12f, 54.27f, 8, -1, 6, -54}, -54}, { new float[] {-9, 27, 98, 56, -8}, -9},
            { new float[] { 4, 3, 5, -4.34f, -4}, -4.34f} };
    }

    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int A, int D, int N, int[] expected) {
        assertEquals(new Variant4().arrayTask(A, D, N), expected);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        int[] expected1 = {2, 6, 18, 54, 162};
        int[] expected2 = {3, 6, 12, 24, 48, 96, 192};
        int[] expected3 = {5, 20, 80, 320, 1280, 5120};
        int[] expected4 = {-1, 2, -4, 8, -16, 32, -64, 128};

        return new Object[][] {{2, 3, 5, expected1}, {3, 2, 7, expected2}, {5, 4, 6, expected3}, {-1, -2, 8, expected4}};
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeSizeOfArrowWhileProvider")
    public void negativeSizeOfArrowWhileProvider(int A, int D, int N) {
        new Variant4().arrayTask(A, D, N);
    }

    @DataProvider
    public Object[][] negativeSizeOfArrowWhileProvider() {
        return new Object[][] {{A, D, -3}, {A, D, 0}, {A, D, -7}};
    }

    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[] input, int M, int N, int[][] expected) {
        assertEquals(new Variant4().twoDimensionArrayTask(input, M, N), expected);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[] input = {7, 2, 43, 23, -41, 231, -2};
        int[] input2 = {1, 13, 83, 14, -1, 31, 98};
        int[] input3 = {-756,231, 2, -23, 4141, 1231, -42};

        int[][] expected1 = {{7, 2, 43, 23, -41, 231, -2},
                {7, 2, 43, 23, -41, 231, -2},
                {7, 2, 43, 23, -41, 231, -2},
                {7, 2, 43, 23, -41, 231, -2},
                {7, 2, 43, 23, -41, 231, -2}};
        int[][] expected2 = {{1, 13, 83, 14, -1, 31, 98},
                {1, 13, 83, 14, -1, 31, 98},
                {1, 13, 83, 14, -1, 31, 98},
                {1, 13, 83, 14, -1, 31, 98},
                {1, 13, 83, 14, -1, 31, 98}};
        int[][] expected3 = {{-756,231, 2, -23, 4141, 1231, -42},
                {-756,231, 2, -23, 4141, 1231, -42},
                {-756,231, 2, -23, 4141, 1231, -42},
                {-756,231, 2, -23, 4141, 1231, -42},
                {-756,231, 2, -23, 4141, 1231, -42}};
        return new Object[][]{{input, 7, 5, expected1}, {input2, 7, 5, expected2}, {input3, 7, 5, expected3}};
    }

        @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeSizeOfTwoDimensionArrowWhileProvider")
        public void negativeSizeOfArrowWhileProvider2(int[] input, int M, int N) {
            new Variant4().twoDimensionArrayTask(input, M, N);
        }

        @DataProvider
        public Object[][] negativeSizeOfTwoDimensionArrowWhileProvider() {
            return new Object[][] {{new int[]{}, 0, -3}, {new int[]{}, -2, 0}, {new int[]{}, -3, -7}};

    }
}
