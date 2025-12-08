// BOJ 2444 - 별찍기7
// 날짜: 2025-12-08
// 분류: 심화

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String star = "*";
        String space = " ";
        int flagPrint = 1;
        int lineNum = scanner.nextInt();
        int starNum = 1;
        int maxCount = 2*lineNum-1;

        while(true) {

            for(int i=1; i < lineNum + starNum; i++) {
                if(i >= lineNum) {
                    System.out.printf(star);
                }
                else {
                    System.out.printf(space);
                }
            }

            if(starNum == maxCount) {
                flagPrint = 2;
            }

            if(flagPrint == 1) {
                starNum += 2;
                lineNum--;
            }
            else {
                starNum -= 2;
                lineNum++;
            }
            if(starNum <= 0) {
                break;
            }

            System.out.println();
        }
    }
}