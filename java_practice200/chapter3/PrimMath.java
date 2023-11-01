public class PrimMath {
    public static boolean isPrime(int n){
        boolean isS = true; //isS변수 true로 초기화
        for(int i =2; i<=(int)Math.sqrt(n);i++){//2부터 n의 제곱 반복
            if(n%i==0){
                isS = false;
                break;//n을 i로 나누어 떨어지는 경우 isS변수를 false로 설정하고 반복문 종료
            }
        }
        return isS;//isS 최종값 반환하여 N이 소시인지 여부 나타냄
    }

    public static void main(String[] args) {
        int number = 1234567; //숫자지정
        boolean ifPrime = isPrime(number);//number대입 함수호출
        if(ifPrime){
            System.out.printf("%는 1과 자신으로만 나눠 떨어지는 소수다." ,number);
        } else {
            System.out.printf("%d은 소수가 아니다." ,number);
        }
    }
}
