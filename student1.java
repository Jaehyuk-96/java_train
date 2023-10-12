public class student1 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public student1(String name, int ban, int no, int kor, int eng, int math) {//생성자 메소드
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal(){//총점계산 메소드
        return kor+eng+math;
    }
    float getAverage(){//평균계산 메소드
        return (int)(getTotal()/3f*10+0.5f)/10f;
    }

    public String info() {//학생 정보를 문자열로 반환하는 메소드
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                ;
    }
}
