public class valueNumDistinction {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;
// charAt(int i) 반복문과 를 이용해서 문자열의 문자를 하나씩 읽어서 검사
        for(int i=0; i < value.length() ;i++) {//문자열의 각문자를 하나씩 확인
            ch = value.charAt(i);// 문자열에서 현재 문자를 가져옴
            if(!('0'<=ch && ch<='9')) {//현재 문자가 숫자가 아닌경우를 확인
                isNumber = false;//숫자가 아니라면 isnumber를 false로 설정
                break;
            }
        }
        if (isNumber) {
            System.out.println(value+"는 숫자입니다.");
        } else {
            System.out.println(value+"는 숫자가 아닙니다.");
        }

    }
}
