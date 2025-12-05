// BOJ 2439 - 별찍기2
// 날짜: 2025-12-05
// 분류: 반복문

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String star = "*";
        String space = " ";
        int lineNum = scanner.nextInt();

        for(int i=1; i < lineNum+1; i++) {
            int spaceCount = lineNum-i;

            for(int j=0; j<lineNum; j++) {
                if(spaceCount > 0) {
                    System.out.printf(space);
                }
                else {
                    System.out.printf(star);
                }

                spaceCount--;
            }
            System.out.println();
        }
    }
}