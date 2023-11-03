
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForLambdaCondition {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s = 0;

        // 1부터 10까지의 정수를 리스트에 추가.
        for (int i = 1; i <= 10; i++) {
            ilist.add(i);
        }

        // Stream API를 사용하여 요소를 필터링, 매핑 및 수집합
        ilist = ilist.stream()
                .filter(i -> i % 2 == 1) // 홀수를 필터링
                .map(i -> i * i) // 홀수를 제곱.
                .collect(Collectors.toList()); // 결과를 새로운 리스트로 수집

        // 리스트의 요소를 출력
        ilist.forEach(i -> {
            System.out.printf(i + " ");
        });
        System.out.println();

        // Stream API를 사용하여 요소의 합계를 계산
        s = ilist.stream().reduce(0, Integer::sum);

        // 합계를 출력
        System.out.println("1~10 사이의 홀수에 대한 제곱합: " + s);
    }
}