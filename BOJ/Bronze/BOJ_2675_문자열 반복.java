// BOJ 2675 - 문자열 반복
// 날짜: 2025-12-04
// 분류: 문자열

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int caseNum;
        caseNum = scanner.nextInt();
        StringBuilder answerStr = new StringBuilder();

        /*
        초기 구상 : 출력에 대한 부분을 각 입력에 매칭된 하나의 문자열로 표현,
        3 ABC < - > answerStr1
        5 /HTP < - > answerStr2
        이런식으로 만들고자 해서 리스트(배열) 필요하다 느낌.. but
        생각해보니 그냥 하나의 문자열로 담고 개행문자로 구분만 해두는게 더 좋지않을까 생각해서
        구조 변경!
        + tempStr 에서 nextLine()으로 입력받을시 " ABC" 이런식으로 맨 앞 공백이 포함됨
        > nextLine()으로 입력받다보니 버퍼에 남아있는 공백문자까지 line 통째로 읽어오는 문제
        공백을 건너뛰고 토큰단위로 읽는 next()로 해결가능
        */
        for(int i=0; i<caseNum; i++) {
            int tempNum = scanner.nextInt();
            String tempStr = scanner.next();
            //tempStr = tempStr.trim();
            for(int j=0; j<tempStr.length(); j++) {
                for(int k=0; k<tempNum; k++) {
                    answerStr.append(tempStr.charAt(j));
                }
            }
            answerStr.append('\n');
        }
        System.out.println(answerStr);
    }
}