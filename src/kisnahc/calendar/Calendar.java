package kisnahc.calendar;

import java.time.Month;
import java.time.MonthDay;
import java.util.Date;
import java.util.Scanner;

public class Calendar {

    private static final int[] MonthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMonthDays(int inputMonth) {
        return MonthDays[inputMonth - 1];
    }

    public void printSampleCalendar() {
        System.out.println(
                "일  월  화  수  목  금  토" + "\n" +
                "--------------------" + "\n" +
                " 1  2  3  4  5  6  7" + "\n" +
                " 8  9 10 11 12 13 14" + "\n" +
                "15 16 17 18 19 20 21" + "\n" +
                "22 23 24 25 26 27 28");
    }
    public static void main(String[] args) {

        //숫자를 입력박아 해당하는 달의 최대 일수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        System.out.println("반복횟수를 입력하세요.");
        int inputRepeat = scanner.nextInt();

        for (int i = 0; i < inputRepeat; i++) {
            System.out.println("달을 입력하세요.");
            int inputMonth = scanner.nextInt();
            System.out.println(inputMonth + "월은 " + cal.getMonthDays(inputMonth) + "일까지 있습니다.");
        }

        System.out.println("Bye~:)");
        scanner.close();
    }

}
