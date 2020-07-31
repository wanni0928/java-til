package com.company;

/**
 *  조건문 - 조건에 따라서 코드의 실행 흐름을 결정
 *  if 계열
 *  switch 계열
 *
 *  [branch 문] - 기계어 수준에서 부르는 조건 실행문
 */

public class Main {

    public static void main(String[] args) {
	    String snum = "510225-2055132";
	    char c = snum.charAt(7);

	    if(c == '1' || c == '3'){
            System.out.println("남자");
        }else{
            System.out.println("여자");
        }

	    int x = 6;
	    if(x % 2 == 0){
            System.out.println("짝");
        }else{
            System.out.println("홀");
        }

        System.out.println(x % 2 == 0 ? "짝": "홀");

	    int score = 2;
	    char grade;

	    if(score >= 9){
	        grade = 'A';
        }else if(score >= 7){
	        grade = 'B';
        }else if(score >= 5){
	        grade = 'C';
        }else if(score >= 3){
	        grade = 'D';
        }else{
	        grade ='F';
        }
	    
	    //Nested if 문

        // switch 문 - case 문의 조건문은 '값'이 들어오게 된다. boolean에 한정되지 않는다.
        // case가 범위가 될 수 없고, case도 값이어야 합니다.
        switch (grade){
            case 'A':
                System.out.println("good"); // fall-through
                break;
            case 'B':
                System.out.println("nice");
                break;
            case 'C':
                System.out.println("try again");
                break;
            case 'D':
                System.out.println("try harder");
                break;
            default:
                System.out.println("...");
        }

    }
}
