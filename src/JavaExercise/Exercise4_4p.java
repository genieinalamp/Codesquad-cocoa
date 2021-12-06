package JavaExercise;
// 1-2+3-4+5-6+7-... 과 같은 식으로 계속 더해갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.
public class Exercise4_4p {
    public static void main(String[] args) {
        int sum = 0;
        int m = 1; // 값의 부호를 바꿔주는데 사용할 변수!
        int num = 0;

        for (int i = 1; true; i++, m=-m) {
            num = m * i;
            sum += num;

            if (sum >= 100) // 총합이 100보다 크거나 같으면 반복문을 빠져나감
                break;
        }
        // 보다 간략히 만들 수도 있다!
        // 너무 오래 붙잡고 있어서 그냥 답 보고 해봤는데 알듯 말듯 모르겠다 ^^ㅎ
//      for (int i=1; sum<100; i++, m=-m) {
//            num = i * m;
//            sum += num;
//        }

        System.out.println("sum=" + sum);
        System.out.println("num+" + num);
    }
}