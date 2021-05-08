package kisnahc.calendar;

public class Calendar {

    private static final int[] MonthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LeapMonthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
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

    public void printCalendar(int inputYear, int inputMonth) {
        System.out.println("   <<" + inputYear + "년" + "  " + inputMonth + "월>>" + "\n" +
                " SU MO TU WE TH FR SA" + "\n" +
                " --------------------");

        int monthDays = getMonthDays(inputYear, inputMonth);

        for (int i = 1; i <= monthDays; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}