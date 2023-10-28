package chapter3;

public class BioCalender {

    //상수값 변경 불가
    public static final int PHYSICAL = 23;

    //멤버 메서드 선언 getBioRhytm days, index max를 받아서 계산해줌
    public double getBioRythm(long days, int index, int max){
        return max*Math.sin((days%index)*2*Math.PI/index);
    }


    public static void main(String[] args) {//신체 지수 구하기
        int days = 1200;
        BioCalender bio = new BioCalender();//객체 생성
        //멤버 메서드 호출
        double phyval=bio.getBioRythm(days, PHYSICAL, 100);
        System.out.printf("나의 신체 지수 %1$.2f입니다.\n" ,phyval);
    }
}
