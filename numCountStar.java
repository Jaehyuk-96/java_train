public class numCountStar {
    public static void main(String[] args) {
        int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
        int[] counter = new int[4];//숫자별 개수를 저장
        for(int i=0; i < answer.length;i++) {
            counter[answer[i]-1]++;//해당 숫자의 갯수를 증가시킴
        }
        for(int i=0; i < counter.length;i++) {
            System.out.print(counter[i]);//숫자별 갯수를 출력
            for(int j=0; j < counter[i];j++) {
                System.out.print("*"); // //숫자 갯수 만큼 별을 출력
            }
            System.out.println();
        }
    }
}
