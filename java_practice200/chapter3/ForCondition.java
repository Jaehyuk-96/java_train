public class ForCondition {
    public static void main(String[] args) {
        int s = 0;//s를 0으로 초기화
        for(int i =1; i<100; i++){
            s+=i;//s=s+i i는 1부터 증가하면서 100까지 반복
        }
        System.out.println("1~100의 합:"+s);
        s=0;    //0으로 초기화
        for(int i =1; i<=100; i++){
            if(i%2==1){//i를2로나눈 나머지가 1일떄(홀수) s=s+i i는 1부터 증가하면서 100까지 반복
                s+=i;
            }
        }
        System.out.println("1~100 사이의 홀수의 합:"+s);
    }
}
