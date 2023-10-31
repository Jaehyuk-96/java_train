public class Constraction {
    public static int sumEach(int n){
        int tot = 0;
        while(n!=0) {//n이 0이아니면 반복
            tot +=n%10;//n의 일의자릿수를 구하여 tot에더함
            n/=10;//n을 10으로 나누었을때 몫을 구함
        }
        return tot;
    }

    public static void main(String[] args) {
        int number =1234567;
        int value = sumEach(number);//sumeach 메소드에 int number 대입
        System.out.printf("%d에 대한 각자리의 숫자 합: %d", number,value);
    }
}
