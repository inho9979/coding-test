// BOJ 14681 - 사분면 고르기
// 날짜: 2025 - 11 - 27
// 분류: 조건문

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int inputNumber, count = 0;
        int x = 0, y = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.println("정수를 입력하세요, 0 입력시 종료");
            inputNumber = scanner.nextInt();
            count++;
            // 반복문 종료조건
            if(inputNumber == 0) {
                System.out.println("반복을 종료합니다");
                break;
            }
            // 입력범위조건
            else if(inputNumber > 1000 || inputNumber < -1000) {
                System.out.println("범위를 초과했습니다, 다시 입력하세요");
                count--;
            }

            if(count == 1) {
                x = inputNumber;
            }
            else if(count == 2) {
                y = inputNumber;

                if(x > 0 && y > 0) {
                    System.out.println(1);
                }
                else if(x < 0 && y > 0) {
                    System.out.println(2);
                }
                else if (x < 0 && y < 0) {
                    System.out.println(3);
                }
                else {
                    System.out.println(4);
                }

                x = 0;
                y = 0;
                count = 0;
            }
        }
    }
}