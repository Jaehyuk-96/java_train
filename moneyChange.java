public class moneyChange {
    public static void main(String[] args) {
        // . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
        int[] coinUnit = {500, 100, 50, 10};//동전 단위를 저장
        int money = 2680;//거스름돈 금액
        System.out.println("money="+money);
        for(int i=0;i<coinUnit.length;i++) {//현재 동전 단위로 거스름돈을 나눈 몫을 출력하여 해당 동전의 개수 표시
            System.out.println(coinUnit[i]+"원:"+money/coinUnit[i]);
                    money = money%coinUnit[i];//방금 나눈 동전단위의 나머지를 다음계산을 위해 저장
        }
    } // main
}

