// BOJ 2480 - 주사위 세개
// 날짜: 2025-12-02
// 분류: 조건문

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int diceA, diceB, diceC;
        int max;
        Scanner scanner = new Scanner(System.in);
        diceA = scanner.nextInt();
        diceB = scanner.nextInt();
        diceC = scanner.nextInt();
        max = diceA;
/*
        조건문의 이해도 부족 코드.... max값을 구하는데 있어서
        if, else if 관계가 아니더라도 위의 조건문을 통과혹은 불통 했을경우 아래의 조건문에 해당하는 경우의 수는
        제한된다는 사실을 이해하지 못하고 짠 코드

        if(max < diceB) {
            if(diceB > diceC) {
                max = diceB;
            }
            else {
                max = diceC;
            }
        }

        if(max < diceC) {
            if(diceB > diceC) { << 지적된 부분
                max = diceB;
            }
            else {
                max = diceC;
            }
        }*/

        // 재대로된 max값 구하는 코드
        if(diceB > max) {
            max = diceB;
        }

        if(diceC > max) {
            max = diceC;
        }

        if(diceA == diceB) {
            if(diceB == diceC) {
                // a == b, b == c, a == c
                System.out.println(10000 + diceA*1000);
            }
            else {
                // a == b, b != c, a != c
                System.out.println(1000 + diceA*100);
            }
        }

        if(diceA != diceB) {
            if(diceB == diceC) {
                // a != b, b == c, a != c
                System.out.println(1000 + diceB*100);
            }
            else if(diceA == diceC) {
                // a != b, b != c, a == c
                System.out.println(1000 + diceA*100);
            }
            else {
                // a!=b, b!=c, a!=c
                System.out.println(max*100);
            }
        }
    }
}