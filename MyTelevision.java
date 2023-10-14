package oct14;

public class MyTelevision {
    boolean isPowerOn;//인스턴스 변수 생성
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {//메소드 생성

        isPowerOn = !isPowerOn; // isPowerOn의 값이 true이면 fasle로, false이면 true로 바꾼다.
    }

    void volumeUp() {

        if (volume < MAX_VOLUME)//volume의 값이 MAX_VOLUME보다 작을때만 값을 1증가시킨다.
            volume++;
    }

    void volumeDown() {
        if (volume > MIN_VOLUME)//volume 값이 MIN_VOLUME보다 클 클떄만 값을 1감소시킨다.
            volume--;
    }

    void channelUp() {
        if (channel == MAX_CHANNEL) {//channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
            channel = MIN_CHANNEL;
        } else {//다른때는 CHANNEL의 값을 1증가시킨다.
            channel++;
        }
    }

    void channelDown() {
        if (channel == MIN_CHANNEL) {//channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
            channel = MAX_CHANNEL;
        } else {//다른때는 CHANNEL의 값을 1감소시킨다.
            channel--;
        }
    }
}



