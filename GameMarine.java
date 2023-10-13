public class GameMarine {
    int x =0, y =0;//현재 위치의 x및 y 좌표를 나타내는 인스턴스 변수
    int hp =60;//체력을 나타내는 인스턴스 변수
    static int weapon = 6;//공격력을 나타내는 정적변수
    static int armor = 0;//방어력을 나타내는 정적변수

    static void weaponUp() {
        weapon++;//무기 업그레이드 메소드: weapon변수를 1 증가시킴
    }

    static void armorUp(){
        armor++;//방어 업그레이드 메소드:armor 변수를 1증가시킴
    }

    void move(int x, int y) {
        this.x =x; //this.x는 인스턴스 변수, x는 지역변수
        this.y =y;//this.y는 인스턴스 변수, y는 지역변수
    }
}
