package kisnahc.calendar;

import java.util.Scanner;

public class Prompt {
    private static final String YEAR_PROMPT = "year> ";
    private static final String PROMPT = "cal> ";

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int inputMonth;
        int inputYear;

        while (true) {
            System.out.println("년도를 입력하세요");
            System.out.println(YEAR_PROMPT);
            inputYear = scanner.nextInt();

            System.out.println("달을 입력하세요.");
            System.out.print(PROMPT);
            inputMonth = scanner.nextInt();

            if (inputMonth == -1) {
                break;
            } else if (inputMonth > 12) {
                continue;
            }
            cal.printCalendar(inputYear, inputMonth);
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