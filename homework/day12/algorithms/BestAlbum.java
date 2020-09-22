package lamda.expression.homework.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class BestAlbum {
    class Song implements Comparable<Song>{ // This interface imposes a total ordering on the objects of each class that implements it.
        int id, play;
        String genre;

        public Song(int id, int play, String genre) {
            this.id = id;
            this.play = play;
            this.genre = genre;
        }

        @Override
        public int compareTo(Song o) {
            if(this.play == o.play){
                return this.id - o.id;
            }else {
                return -(this.play - o.play);
            }
        }
    }

    ArrayList<Integer> bestAlbum;
    ArrayList<Song> songList;
    HashMap<String, Integer> genreMap;
    HashMap<String, Integer> albumMap;

    public int[] solution(String[] genres, int[] plays) {
        bestAlbum = new ArrayList<>(); // 배스트 앨범의 인덱스 값을 담는 리스트
        songList = new ArrayList<>(); // 노래 객체를 담는 리스트
        genreMap = new HashMap<>(); // 장르, 조회수
        albumMap = new HashMap<>(); // 앨범, 곡 갯수 : 각 장르의 앨범에는 2곡만 들어간다.

        for(int i = 0; i < genres.length; i++){ // 장르 배열 만큼 for문을 돌려서, 해당 장르의 인덱스, 조회수, 장르 이름을 담는다.
            int id = i;
            int play = plays[i];
            String genre = genres[i];

            songList.add(new Song(id,play,genre)); // Song 객체(id, play, genre)들은 songList에 담는다.
            if(genreMap.containsKey(genre)){ //genreMap에 '장르(key)', '조회수(value)'를 담는데, 이미 해당 장르(key)를 가지고 있다면, 기존의 조회수에 plays 배열의 조회수(value)를 새로 담는다.
                genreMap.put(genre, genreMap.get(genre) + play);
            } else {
                genreMap.put(genre, play);
            }
        }

        Collections.sort(songList, (s1, s2) -> {
            if(s1.genre.equals(s2.genre)){ // 장르가 같다면 (조회수의 오름차순으로, 하지만, 조회수가 같다면, 인덱스 번호의 오름차순으로 나열.)
                return s1.compareTo(s2);
            } else {// 기본적으로 해당 노래는 '조회수'의 내림차순으로 나열
                return -(genreMap.get(s1.genre) - genreMap.get(s2.genre));
            }
        });

        for(Song song : songList){
            if(!albumMap.containsKey(song.genre)) {
                albumMap.put(song.genre, 1);
                bestAlbum.add(song.id);
            } else {
                int genreCnt = albumMap.get(song.genre);
                if(genreCnt >= 2){
                    continue;
                }else {
                    albumMap.put(song.genre, genreCnt + 1);
                    bestAlbum.add(song.id);
                }
            }
        }

        int[] answer = new int[bestAlbum.size()];
        for(int i = 0 ; i < answer.length ; ++i){
            answer[i] = bestAlbum.get(i);
        }

        return answer;
    }
    
//    public static void main(String[] args) {
//        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
//        Integer[] plays = {500, 600, 150, 800, 2500};
//        int[] test = null;
//        BestAlbum ba = new BestAlbum();
//
//        test = ba.solution(genres, plays);
//        for (int i : test) {
//            System.out.println(i);
//        }
//    }
}
