package kisnahc.calendar;

import java.util.Scanner;

public class Prompt {

    private static final String YEAR_PROMPT = "year> ";
    private static final String PROMPT = "cal> ";
    private static final String DAY = "day> ";

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();


        int inputMonth;
        int inputYear;
        String inputDay;

        while (true) {
            System.out.println("년도를 입력하세요.");
            System.out.print(YEAR_PROMPT);
            inputYear = Integer.parseInt(scanner.nextLine());

            System.out.println("달을 입력하세요.");
            System.out.print(PROMPT);
            inputMonth = Integer.parseInt(scanner.nextLine());

            System.out.println("첫번째 요일을 입력하세요. ex) SU, MO, TU, WE, TH, FR, SA");
            System.out.print(DAY);
            inputDay = scanner.nextLine();

            //inputDay.trim();
            Days days = Days.valueOf(inputDay);
            //Days days = Days.MO;


            if (inputMonth == -1) {
                break;
            } else if (inputMonth > 12) {
                continue;
            }
            cal.printCalendar(inputYear, inputMonth, days);
        }
        System.out.println("Have a nice day~:)");
        scanner.close();
    }

    public static void main(String[] args) {
        //셀 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}