package com.company;

/**
 * 369게임+
 *
 * 369게임에 참여했을 때, 내가 외쳐야 하는 숫자나 동작을 순서대로 출력하시오.
 *
 * 규칙
 * 1. 3, 6, 9, 5가 포함되지 않은 숫자는 숫자를 외친다. (2!)
 * 2. 숫자에 포함된 3, 6, 9의 개수 만큼 박수를 친다. (짝!)
 * 3. 숫자에 포함된 5의 개수 만큼 발을 구른다. (쿵!)
 * 4. 박수와 발구르기의 순서는 관계 없으나, 반드시 번갈아 수행한다.
 *
 * 예시
 * 2   -> 2!
 * 33  -> 짝!짝!
 * 553 -> 쿵!짝!쿵! (짝!쿵!쿵!x)
 * 47  -> 47!
 *
 * 인자
 * gameLength: 게임이 종료되는 데 걸리는 턴 수
 * numPeople: 게임에 참여하는 인원 수
 * myTurn: 내가 숫자를 외치는 순번
 */

public class ThreeSixNine {
    public static void main(String[] args) {

        int gameLength = 9999;
        int numPeople = 12;
        int myTurn = 3;

        int start = 0;
        int end = 0;
        String regexTSN = "[0-9&&[369]]";
        StringBuilder stringBuilder = new StringBuilder();

        for(int turn = 1; turn <= gameLength; turn++){
            if(turn % numPeople == myTurn){
                stringBuilder.append((turn + "")
                        .replaceAll(regexTSN, "짝!")
                        .replaceAll("[0-9&&[5]]", "쿵!")
                        .replaceAll("[0-9&&[^3569]]", ""));

                if(stringBuilder.indexOf("짝!짝!쿵!") != -1){
                    start = stringBuilder.indexOf("짝!짝!쿵!");
                    end = "짝!짝!쿵!".length();
                    stringBuilder.replace(start, end, "짝!쿵!짝!");
                }else if(stringBuilder.indexOf("쿵!짝!짝!") != -1){
                    start = stringBuilder.indexOf("쿵!짝!짝!");
                    end = "짝!짝!쿵!".length();
                    stringBuilder.replace(start, end, "짝!쿵!짝!");
                }
                System.out.print("내 차례다! : " + turn);
                System.out.print(", " + stringBuilder + "\n");
                stringBuilder.delete(0, stringBuilder.length());
            }else {
                continue;
            }
        }
    }
}
