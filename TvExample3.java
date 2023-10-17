package oct16;

public class TvExample3 {
    public static void main(String[] args) {
        MyTv3 mytv= new MyTv3();
        mytv.setChannel(10);//10채널로가기
        System.out.println("CH:"+mytv.getChannel());
        mytv.setChannel(20);//20채널로가기
        System.out.println("CH:"+mytv.getChannel());
        mytv.gotoPrevChannel();//이전채널로돌아가기
        System.out.println("CH:"+mytv.getChannel());
        mytv.gotoPrevChannel();//이전채널로돌아가기
        System.out.println("CH:"+mytv.getChannel());

    }
}
