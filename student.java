public class student {//필드선언
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    //생성자가 없는경우 , 기본 생성자가 자동으로 생성됨

    int getTotal() {//메소드생성
        return kor+eng+math;
    }

    float getAverage() {//메소드 생성
        return (int)(getTotal()/3f*10+0.5f)/10f;
    }
}
