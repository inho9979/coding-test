// BOJ 1546 - 평균
// 날짜: 2025-12-01
// 분류: 1차원배열

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 0;
        double maxScore = 0;
        double scoreSum = 0;
        double scoreAvg;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        double[] scoreArr = new double[n];
        for(int i=0; i<n; i++) {
            scoreArr[i] = scanner.nextInt();
            if(maxScore == 0) {
                maxScore = scoreArr[i];
            }
            else {
                if(maxScore < scoreArr[i]) {
                    maxScore = scoreArr[i];
                }
            }
        }

        for(int i=0; i<n; i++) {
            scoreArr[i] = (scoreArr[i]/maxScore) * 100;
        }
        for(int i=0; i<n; i++) {
            scoreSum += scoreArr[i];
        }
        scoreAvg = scoreSum/n;
        System.out.printf("%.6f",scoreAvg);
    }
}