package JavaExercise;

public class Exercise4_5 {
    // for문을 while문으로 변경하기
    // while문은 if문처럼 조건식과 블럭{}만으로 이루어져 있으며, 조건식이 참인 동안 문장을 반복한다.
    public static void main(String[] args) {
//        for (int i =0; i <= 10; i++) {
//            for (int j = 0; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
        int i=0;
        while ( i <= 10 ) {
            int j=0;
            while ( j <= i ) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    } // end of main
} // end of class

// 211122 와아아아아악 드디어 풀었다 j 초기화를 안에다 넣으니까 바로 해결 됨
