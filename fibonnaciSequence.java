public class fibonnaciSequence {
    public static void main(String[] args) {
        // 피보나치 수열의 시작의 첫 두 숫자를 1,1  로 한다
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번째 값
        System.out.print(num1 + "," + num2);
        for (int i = 0; i < 8; i++) { //8번반복
            num3 = num1 + num2; //  세번째 값은 첫번째와 두번째 값을 더해서 얻는다
            System.out.print("," + num3); // 세번째 수열 출력
            num1 = num2; // 두 번째 수열을 첫 번째 값으로 한다
            num2 = num3; // 세 번째 수열을 두 번째 값으로 한다

        }
    }
}
