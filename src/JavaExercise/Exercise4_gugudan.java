package JavaExercise;

public class Exercise4_gugudan {
    public static void main(String[] args) {
        Loop1 : for(int i=2; i <= 9; i++){
            for(int j=1; j <=9;j++) {
                if(j==5)
                    break Loop1;
//                    break;
//                    continue Loop1; <- 과 같은 문장을 쓸 일은 거의 없을 테니 무시해도 좋음.
//                    continue;
                System.out.println(i+"*"+ j +"="+ i*j );
            } // end of for i
            System.out.println();
        } // end of Loop1

    }
}
