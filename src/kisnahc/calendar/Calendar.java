package kisnahc.calendar;

import java.time.Month;
import java.time.MonthDay;
import java.util.Date;
import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {

//        System.out.println(
//                "일  월  화  수  목  금  토" + "\n" +
//                "--------------------" + "\n" +
//                " 1  2  3  4  5  6  7" + "\n" +
//                " 8  9 10 11 12 13 14" + "\n" +
//                "15 16 17 18 19 20 21" + "\n" +
//                "22 23 24 25 26 27 28");

        //숫자를 입력박아 해당하는 달의 최대 일수를 출력하는 프로그램
        System.out.println("달을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int inputMonth = scanner.nextInt();

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(inputMonth + "월은 " + monthDays[inputMonth-1] + "일까지 있습니다.");
        scanner.close();
    }

}
