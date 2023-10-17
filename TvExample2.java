package oct16;

public class TvExample2 {
    public static void main(String[] args) {
        MyTv2 mytv= new MyTv2();
        mytv.setChannel(10);///10채널로가기
        System.out.println("CH:"+mytv.getChannel());
        mytv.setVolume(20);//20채널로가기
        System.out.println("VOLUME: = " + mytv.getVolume());

    }
}
