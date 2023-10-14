package oct14;

public class MyTelevisionExample {
    public static void main(String[] args) {
        MyTelevision tv = new MyTelevision();

        tv.channel = 100;
        tv.volume = 0;
        System.out.println("CH:"+tv.channel+",VOL:"+tv.volume);

        tv.channelDown();
        tv.volumeDown();
        System.out.println("CH:"+tv.channel+",VOL:"+tv.volume);


        tv.volume = 100;
        tv.channelUp();
        tv.volumeUp();
        System.out.println("CH:"+tv.channel+",VOL:"+tv.volume);

    }
}
