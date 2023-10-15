package oct15;


class SutdaCard1 {
    int num; //인스턴스 변수 생성
    boolean isKwang;

    SutdaCard1() {//디폴트생성자
        this(1, true);//num을 1로 iskwang을true로 초기화
    }

    SutdaCard1(int num, boolean isKwang){//매개변수를 받는 생성자, 입력된 num과 iskwang 값을 사용하여 필드르 초기화
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K":"");//tostring 메서드는 카드를 문자열로 표현하기 위한 메서드
    }//num과 kwang에 따라 문자열을 생성하여 반환함.
}
