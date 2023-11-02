
import java.util.ArrayList;
import java.util.List;

public class LottoList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//Arraylist에 integer로 값을 받음
        for(int i=1; i<=10; i++){
            list.add(i);//list에 1부터 10까지추가
        }

        for(int i=0;i< list.size(); i++){
            int m =list.get(i);//list size크기만큼 출력
            System.out.println(m);
        }
        System.out.println();
    }
}
