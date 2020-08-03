package com.company;

/**
 * 도메인 뒤집기
 *
 * 주어진 홈페이지 주소를 .을 기준으로 각각 뒤집어 출력하시오.
 *
 * ex) www.google.com -> www.elgoog.moc
 *
 * 인자
 * string: 홈페이지 주소
 */

public class DomainReverse {
    public static void main(String[] args) {
        String string = "www.google.com";
        String[] strings = string.split("[.]");
        StringBuffer sb = new StringBuffer();

        for ( String str : strings) {
            for (int i = str.length()-1; i>=0; i--){
                sb.append(str.charAt(i));
            }
            sb.append(".");
        }
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
