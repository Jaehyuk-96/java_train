package nov20;

import java.util.ArrayList;

public class BillboardArrayMain {
    public static void main(String[] args) {
        ArrayList<Billboard> bills = new ArrayList<>();//arraylist 객체 생성
        bills.add(new Billboard(1,"despacito",1,"#",""));//생성자 값 대입
        bills.add(new Billboard(2,"that's what i like",2,"#", "brunomars"));//생성자 값 대입
        bills.add(new Billboard(3,"im the one",3,"#","dj haled"));//생성자 값 대입
        System.out.println(bills.size());//arraylist 사이즈 구함
        showAbout(bills.get(0));//index 0번째 가져와서 보여줌
        bills.remove(1);//1번 지움
        System.out.println(bills.size());//arraylist 사이즈 구함
        System.out.println("------------------");
        for(Billboard bb : bills){
            showAbout(bb);
        }
    }

    private static void showAbout(Billboard bb) {
        String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
    }
}
