public class specificGugudan {
    public static void main(String[] args) {
            for (int i = 1 ; i <= 9 ; i++) {//1부터 9까지 반복
                for (int j = 1; j <= 3; j++) {//1부터 3까지 반복
                    int x = j+1+(i-1)/3*3;// 첫번째 숫자를 계산
                    int y = i%3==0? 3 : i%3 ;//두번째 숫자를 계산
                    if(x > 9) // 9 . 10 . 단까지만 출력한다 이 코드가 없으면 단까지 출력된다
                        break;
                    System.out.print(x+"*"+y+"="+x*y+"\t"); //println이 아님에 주의
                }
                System.out.println();
                if(i%3==0) System.out.println(); //3번째 행마다 한 번 더 줄을 바꿔서 더 보기 좋게 출력
            }
        }
    }

