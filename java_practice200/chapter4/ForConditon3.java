import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ForConditon3 {
    public static void main(String[] args) {
        List<Integer> ilist =  new ArrayList<>();
        int s = 0;
        for(int i =1; i<= 100; i++) {//1부터 100까지 반복
            ilist.add(i);//list에 저장
        }

        s=ilist.stream().reduce(0,Integer::sum);//합을 구할때 reduce를 이용하여 간편하게 연산
        System.out.println("1~100의 합:"+s);
        s=0;
        //1~100 사이 홀수의 합
        s=ilist.stream().filter(i->i%2==1).reduce(0,(x,y)->x+y);//리스트를 스트림으로 변환 리스트에서 홀수만 필터링,
        // reduce를 사용하여 홀수의 합을 계산
        System.out.println("1~100 사이 홀수의 합: "+s);
        //1~100 사이 홀수의 합
        s=ilist.stream().filter(i->i%2==1).reduce(0, new BinaryOperator<Integer>() {//BinaryOperator를 구현하는 익명 클래스를 사용함
            @Override
            public Integer apply(Integer t, Integer u) {
                return t+u;
            }
        });
        System.out.println(("1~100사이의 홀수의 합" + s));
    }
}
