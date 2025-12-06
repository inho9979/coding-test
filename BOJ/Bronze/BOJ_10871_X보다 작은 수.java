// BOJ 10871 - X보다 작은 수
// 날짜: 2025-12-06
// 분류: 1차원배열

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, x;
        boolean flag = true;
        ArrayList<Integer> arrayList = new ArrayList<>();

        n = scanner.nextInt();
        x = scanner.nextInt();

        while(flag) {
            arrayList.add(scanner.nextInt());
            n--;

            if(n == 0) {
                flag = false;
            }
        }

        for (Integer answerInt : arrayList) {
            if(answerInt < x) {
                System.out.printf(answerInt + " ");
            }
        }
    }
}