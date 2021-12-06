package JavaExercise;

public class Ex5_2 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장하기 위한 변수
        float average = 0f; // 평균을 저장하기 윈한 변수

        int[] score = { 100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i]; // 반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.

        }
        average = sum / (float)score.length; // 계산결과를 float타입으로 얻으려고 형변환!!

        System.out.println("총합: "+sum);
        System.out.println("평균: "+average);

    }
}
