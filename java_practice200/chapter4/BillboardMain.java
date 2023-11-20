package nov20;

public class BillboardMain {
    public static void main(String[] args) {
        int rank = 1; //정수 저장
        String song = "Despacito";//문자열 저장
        int lastweek =1;//data를 그릇에 담음.
        String imagesrc = "#";
        String artist = "luis fonsi";
        String sf = String.format("%d, %s ,%d, %s, %s", rank, song, lastweek , imagesrc, artist);//String.format으로 출력
        System.out.println(sf);
    }
}
