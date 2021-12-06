package JavaExercise;
//    1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10) 의 결과를 계산하시오.
public class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        int i = 1;

        while ( i <= 10 ) {
            sum += i++;
            System.out.println("sum="+sum);
            totalSum += sum;
            // 토탈썸을 반복문 안에 넣어야 총 합이 구해진다 이거 밖에 놓으면 틀림!
        }

        System.out.println("totalSum="+totalSum);


    }

}
