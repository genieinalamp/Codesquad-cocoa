package JavaExercise;

import java.util.Arrays;

public class Exercise5_3{
    public static void main(String[] args) {

//        int [] arr;       // int타입 배열 선언
//        arr = new int[5]; // 배열 생성
//        int [] arr  = new int[5]; 배열 선언과 생성을 동시에 할 수 있다 (대부분 이렇게 함!)
//        int [] arr = new int[]{1,2,3,4,5}; 배열 생성과 초기화를 동시에 할 수도 있드아 - 이때 괄호 안에 배열의 길이는 적지x
//        int [] arr = {1,2,3,4,5}; new int[] 생략가능 (but, 배열의 선언과 생성을 따로할 경우에는 생략불가)
//        System.out.println(Arrays.toString(arr)); // 출력할 때에는 Arrays.toString(배열이름) 메서드를 사용한다

//        배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
        int[] arr = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for ( int i = 0; i<arr.length; i++ ) {
            sum += arr[i];
        }
        System.out.println("sum=" + sum);
    }

}
