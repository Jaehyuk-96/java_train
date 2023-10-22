package oct22;

public class Point {
    int x; //x좌표
    int y; //y좌표

    Point(){
        this(0,0);//x와y를 0으로 초기화
    }

    Point(int x, int y){
        this.x =x;//x 좌표 초기화
        this.y =y;//y 좌표 초기화
    }

    public String toString() {//좌표 정보를 문자열로 반환하는 toString()메서드
        return "["+x+","+y+"]";
    }
}
