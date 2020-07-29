package com.company;

import java.util.Scanner;

/**
 * 환자 레코드 출력하기
 *
 * 환자 레코드를 열전사 프린터로 보기좋게 프린트하려 한다.
 * 환자의 ID, 환자의 병명, 그리고 비고 사항을 입력받아
 * 포맷에 맞게 출력하는 프로그램을 작성하시오.
 *
 * 제한 사항
 * - 환자의 ID는 1 이상 999999 이하의 정수로 입력된다고 가정한다.
 * - 환자의 병명은 5자 이하의 문자열로 입력되며, 좌측 정렬하여 출력한다.
 * - 비고 사항은 10자 이하의 문자열로 입력되며, 좌측 정렬하여 출력한다.
 *
 * 출력 포맷
 * *----------*--------*---------------*
 * | ID004029 | 코로나19 | 자가 격리 조치   |
 * *----------*--------*---------------*
 *
 */


public class PrintFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("환자의 ID를 입력하세요.");
        int id = scanner.nextInt();

        // nextLine은 엔터를 치는 순간 입력이 되었다고 인식하기 때문에, nextInt와 같은 메소드를
        // 사용할 때, 입력이 꼬이지 않게 nextLine 메소드를 별도록 사용하였다.
        // 그냥 한칸 띄고 환자의 병명을 입력할 순 있지만, 사용자들은 보통 다음 문장을 칠때
        // 엔터로 넘기는 경우가 일반적이기 때문에, 이런식으로 처리하는 것이 더 보편적일 수 있다.
        scanner.nextLine();

        System.out.println("환자의 병명을 입력하세요.(5자 이하로 입력해주세요.)");
        String s1 = scanner.nextLine();
        System.out.println("환자의 비고 사항을 입력하세요.(10자 이하로 입력해주세요.)");
        String s2 = scanner.nextLine();

        if(s1.length() > 5 || s2.length() > 10 || id >= 1000000){
            System.out.println("입력범위를 초과하셨습니다. 다시 실행해서 입력 해주세요.");
            System.exit(0);
        }else{
            System.out.println("*----------*--------*---------------*");
            System.out.printf("| id%06d | %-5s | %-10s |\n",id, s1, s2);
            System.out.println("*----------*--------*---------------*");
        }
    }
}
