// BOJ 2908 - 사아수
// 날짜: 2025-12-09
// 분류: 문자열

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        int answerNum1 = 0, answerNum2 = 0;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        for(int i=2; i>=0; i--) {
            answerNum1 += (int) (num1%10 * Math.pow(10,i));
            answerNum2 += (int) (num2%10 * Math.pow(10,i));

            num1 = num1/10;
            num2 = num2/10;
        }

        if(answerNum1 > answerNum2) {
            System.out.println(answerNum1);
        }
        else {
            System.out.println(answerNum2);
        }
    }
}