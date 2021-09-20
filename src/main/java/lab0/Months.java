package lab0;

public enum Months {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private int days;

    Months(int days) {
        this.days = days;
    }

    public int intGetDays() {
        return days;
    }

    public static Months byOrdinal2ndWay(int ord) {
        return Months.values()[ord-1];
    }
}
