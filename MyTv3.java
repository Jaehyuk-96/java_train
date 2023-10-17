package oct16;

public class MyTv3 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel; //이전채널

    final int MAX_VOLUME = 100;//최대 음량 상수
    final int MIN_VOLUME = 0;//최소 음량 상수
    final int MAX_CHANNEL = 100;//최대 채널 상수
    final int MIN_CHANNEL = 1;//최소 채널 상수

    public void setVolume (int volume) {//음량 설정 메서드
        if(volume >MAX_VOLUME || volume <MIN_VOLUME)//음량이 유효한 범위를 벗어나면 아무것도 안함
            return;


        this.volume = volume;
    }

    public int getVolume() {//현재 음량을 반환하는 메서드
        return volume;
    }

    public void setChannel(int channel){//채널 설정 메서드
        if(channel>MAX_CHANNEL ||channel <MIN_CHANNEL)//채널이 범위를 벗어나면 아무것도 안함
            return;


        prevChannel = this.channel;//현재 채널을 이전 채널에 저장한다.
        this.channel = channel;
    }

    public int getChannel(){//현재 채널을 반환하는 메서드
        return channel;
    }

    public void gotoPrevChannel(){
        setChannel(prevChannel);//현재 채널을 이전 채널로 변경한다.
    }

}


