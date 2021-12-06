package JavaExercise;

public class Exercise4_8 {
    // Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
    public static void main(String[] args) {
        int value = ((int)(Math.random() * 6) + 1);
     //   1 <= (int)(Math.random() * 6) + 1 < 7

        System.out.println("value:"+value);
    }
}
