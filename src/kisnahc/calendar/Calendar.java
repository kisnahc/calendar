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

    public void printCalendar(int inputYear, int inputMonth) {
        /**
         * 기준일 - 1583년(그레고리력이 시행된 년도) 1월 1일 토요일
         */
        int sum = 0;
        for (int i = 1583; i < inputYear; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                sum += 2;
            } else {
                sum += 1;
            }
        }
        int firstDay = (sum + 6) % 7; // 1월 1일 토요일.

        for (int j = 1; j < inputMonth; j++) {
            firstDay += getMonthDays(inputYear, j) % 7;
        }

        int day = firstDay % 7;
        int num = 1;
        int max = getMonthDays(inputYear, inputMonth);
        boolean start = false;

        System.out.println("   <<" + inputYear + "년" + "  " + inputMonth + "월>>" + "\n" +
                " SU MO TU WE TH FR SA" + "\n" +
                " --------------------");

        loop:
        for (int row = 0; row <= 5; row++) {
            for (int column = 0; column <= 6; column++) {
                if (row == 0 && !start) {
                    if (column == day) {
                        start = true;
                    } else {
                        System.out.print("   ");
                        continue;
                    }
                }

                System.out.printf("%3d", num);
                num++;

                if (num > max) {
                    break loop;
                }
            }
            System.out.println("");
        }

    }
}
