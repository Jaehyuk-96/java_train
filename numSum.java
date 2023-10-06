public class numSum {
    public static void main(String[] args) {

            int num = 12345;
            int sum = 0;
            while(num > 0) {//num이 0보다 큰 동안 반복함.
                sum += num%10;//num을 10으로 나눈 나머지(마지막 자릿수)를 sum에 더함.
                num /= 10;//num을 10으로 나누어 마지막 자릿수를 제거
            }
            System.out.println("sum="+sum);
        }


    }

