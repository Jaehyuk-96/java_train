package chapter3;

public class EvenOddIfCondition {
    public static void main(String[] args) {
        int temp = 99;
        if(temp%2==1){//2로나눴을때 나머지가 1이니까 홀수
            temp= temp*3+1;
        }else{//아닐때는 짝수
            temp=temp/2;
        }
        System.out.println("계산결과:"+temp);//연산결과
    }
}
