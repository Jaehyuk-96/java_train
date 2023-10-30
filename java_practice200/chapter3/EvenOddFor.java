public class EvenOddFor {
    public static void showOddnEven(int n) {
        int temp = n;
        for (; temp != 1; ) {//초기값 스텝이 없으면 while 문과 동일
            if (temp % 2 == 1) {
                temp = temp * 3 + 1;//홀수일떄
            } else {
                temp /= 2;//짝수일때
            }
            System.out.print(temp);
        }
        System.out.println("\n---------------------");
    }

    public static void main(String[] args) {
        showOddnEven(122);//122값 대입후 showOddnEven 메서드 실행
    }
}
