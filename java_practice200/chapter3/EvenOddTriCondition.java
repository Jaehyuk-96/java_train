package chapter3;

public class EvenOddTriCondition {
    public static void main(String[] args) {
        int temp=99;
        temp = (temp %2 ==1)? temp*3+1 : temp/2;//삼항연산자 사용 홀수면 temp*3+1, 짝수면 temp/2
        System.out.println("계산결과:"+temp);
    }
}
