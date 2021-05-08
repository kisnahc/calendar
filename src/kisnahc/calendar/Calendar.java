package kisnahc.calendar;

public class Calendar {

    private static final int[] MonthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LeapMonthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int inputYear) {
        if (inputYear % 4 == 0 && (inputYear % 100 != 0 || inputYear % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public int getMonthDays(int inputYear, int inputMonth) {
        if (isLeapYear(inputYear)) {
            return LeapMonthDays[inputMonth - 1];
        } else {
            return MonthDays[inputMonth - 1];
        }

    }

    public void printCalendar(int inputYear, int inputMonth, Days days) {
        System.out.println("   <<" + inputYear + "년" + "  " + inputMonth + "월>>" + "\n" +
                " SU MO TU WE TH FR SA" + "\n" +
                " --------------------");

        int monthDays = getMonthDays(inputYear, inputMonth);

        for (int i = 0; i < days.getSpaceCount(); i++) {
            System.out.print(" ");
        }

        int start = 1;
        for (int i = 0; i < 7 - days.getSpaceCount() / 3; i++) {
            System.out.printf("%3d", start);
            start++;
        }
        System.out.println();

        int j = 0;
        for (int i = start; i <= monthDays; i++) {
            System.out.printf("%3d", i);
            j++;
            if (j % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    //기능수행 목적.
}