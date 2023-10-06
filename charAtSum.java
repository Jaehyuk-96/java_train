public class charAtSum {
    public static void main(String[] args) {

            String str = "12345";
            int sum = 0;//변수 초기화
            for(int i=0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';//현재 문자를 숫자로 변환하여 합에 더함.
            }
            System.out.println("sum="+sum);
        }
    }

