import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {
    public static void main(String[] args) {
        List<Integer> mmlists = Arrays.asList(1,6,16,22,23,33); //리스트 생성및 초기화
        mmlists.forEach(
                m -> {System.out.println(m);//람다식으로 리스트 출력
                }
        );
        System.out.println();//줄바꿈
        Consumer<Integer> consume = (Integer m) -> {
            System.out.println(m);//consumer 인터페이스를 사용하여 리스트 요소 출력
        };
        mmlists.forEach(consume);
    }

}
