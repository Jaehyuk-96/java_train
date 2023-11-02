import java.util.ArrayList;
import java.util.List;

public class ForCondition2 {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();//Arraylist 객체 생성
        int s = 0;
        for(int i =1; i<=10 ; i++){
            ilist.add(i);//1~10까지 ilist에 값저장
        }
        for(int m: ilist){//ilist에서 m으로 뽑아냄
            if(m%2==1){
                s+=m*m;//홀수인 m의 제곱을 계속 더함
                System.out.println(m*m);//제곱값 출력
            }
        }
        System.out.println();
        System.out.println("1~10사이의 홀수에대한 제곱의 합: " +s);//제곱의 합 출력
    }
}
