public class EvenOdd {
    public static void showOddnEven(int n){
        int temp = n;// n을 temp 변수에 저장
        do{
            if(temp%2==1){
                temp = temp*3+1; //홀수일때 계산
            }else{
                temp/=2; // 짝수일때 계삭
            }
            System.out.println("["+temp+"]");

        }while(temp!=1);//1이 될떄까지 반복
        System.out.println("\n-------------------------");//끝난후 구분선 출력
    }

    public static void main(String[] args) {
        showOddnEven(122); //122대입 showOddnEven 메서드
    }
}
