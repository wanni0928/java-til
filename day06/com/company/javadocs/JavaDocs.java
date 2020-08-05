package com.company.javadocs;

/**
 * 클래스에 대한 설명. 이 클래스는 자바독 클래스로서 자바독을 공부하기 위해
 * @author chj
 *
 */
public class JavaDocs {
    /**
     * 멤버 변수에 대한 설명을 적을 수 있습니다.
     * */
    int memberInt;
    /**
    * 멤버 변수 또 다른것도 설명을 적을 수 있습니다
    */
    String memberString;

    /**
     * 생성자에 대한 설명
     * @param memberInt 입력 1
     * @param memberString 입력 2
     */
    public JavaDocs(int memberInt, String memberString) {
        this.memberInt = memberInt;
        this.memberString = memberString;
    }

    /**
     *
     * @param string
     * @return
     */
    public int methodA(String string){
        return string.length();
    }
    public static void main(String[] args) {
        System.out.println("");
    }
}
