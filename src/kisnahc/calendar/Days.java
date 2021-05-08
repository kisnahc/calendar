package kisnahc.calendar;

public enum Days {
    SU(0),
    MO(3),
    TU(6),
    WE(9),
    TH(12),
    FR(15),
    SA(18);

    private int spaceCount;

    Days(int spaceCount){
        this.spaceCount = spaceCount;
    }

    public int getSpaceCount() {
        return this.spaceCount;
    }
}
