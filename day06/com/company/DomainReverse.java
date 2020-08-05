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

        int i = string.indexOf('.');
        StringBuilder s = new StringBuilder(string.length());
        while (i > 0) {
            System.out.println("i : " + i);
            StringBuilder s_ = new StringBuilder(string.substring(0, i));
            System.out.println(s_);
            string = string.substring(i + 1);
            System.out.println(string);
            s.append(s_.reverse());
            s.append('.');
            System.out.println(s);
            i = string.indexOf('.');
        }
        s.append(new StringBuilder(string).reverse());
        string = s.toString();

        System.out.println(string);
    }
}
