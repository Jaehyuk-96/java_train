public class palindrome {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        int result =0; //변수 number를 거꾸로 변환해서 담을 변수
        while(tmp !=0) {
            result = result*10 + tmp % 10; // tmp 변수의 가장 오른쪽 자릿수를 result 변수의 가장 왼쪽 자릿수로 이동
            tmp /= 10;//tmp변수의 가장 오른쪽 자릿수를 제거하는 역할
        }
        if(number == result)
            System.out.println(number + "는 회문수 입니다 .");
        else
        System.out.println(number + " .");

    }
}
