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
            System.out.println("년도를 입력하세요.");
            System.out.print(YEAR_PROMPT);
            inputYear = Integer.parseInt(scanner.nextLine());

            System.out.println("달을 입력하세요.");
            System.out.print(PROMPT);
            inputMonth = Integer.parseInt(scanner.nextLine());

            if (inputMonth == -1) {
                System.out.println("Bye ~ :)");
                break;
            } else if (inputMonth > 12) {
                System.out.println("cal은 1 ~ 12월 사이를 입력하세요." + "\n");
                continue;
            }
            cal.printCalendar(inputYear, inputMonth);
            System.out.println();

        }
        scanner.close();
    }

    public static void main(String[] args) {
        //셀 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}