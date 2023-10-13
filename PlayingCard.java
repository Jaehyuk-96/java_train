public class PlayingCard {
    int kind; //카드의 종류를 나타내는 인스턴스 변수
    int num;//카드의 번호를 나타내는 인스턴스 변수

    static int width; //카드의 폭을 나타내는 static 변수
    static int height;//카드의 높이를 나타내는 static 변수

    PlayingCard(int k, int  n) {
        kind = k;//지역변수 k를 kind로
        num = n;//지역변수 n을 num으로
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
    }
}
