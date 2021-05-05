package kisnahc.calendar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("두 수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        int inputInt1 = scanner.nextInt();
        int inputInt2 = scanner.nextInt();

        int x = inputInt1;
        int y = inputInt2;

        int sum = (x + y);

        System.out.println("두 수의 합은 " + sum + " 입니다.");
    }
}
