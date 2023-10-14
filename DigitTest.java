package oct14;

public class DigitTest {
    public static boolean isNumber(String str) {
        if (str == null || str.equals(""))//str이 null이거나 ""이면 false를 반환 유효성검사
            return false;

        for (int i = 0; i < str.length(); i++) {//문자열의 각문자를 검사하여 숫자가 아닌문자가 하나라도 있으면 false를 반환
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {//str이 0보다작거나 9보다크면 숫자가 아니라서 false를 반환
                return false;
            }
        }
        return true;//문자가 숫자인 경우에만 true를 반환

    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
