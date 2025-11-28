// BOJ 10952 - A+B -5
// 날짜: 2025-11-28
// 분류: 반복문

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0, b = 0;
        String inputString;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while(flag) {

            inputString = scanner.nextLine();
            String[] tempStr = inputString.split(" ");
            a = Integer.parseInt(tempStr[0]);
            b = Integer.parseInt(tempStr[1]);

            if(a == 0 && b == 0) {
                break;
            }
            System.out.println(a+b);
        }
    }
}