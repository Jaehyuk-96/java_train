import java.util.Arrays;



public class ArrayInit {
    public static void main(String[] args) {
        //기본 타입의 배열 사용 방법 1 선언
        int[] a;
        //a={1,2,3};
        //정의
        a=new int[5];
        a[0]=2; a[1]=5; a[2]=3; a[3]=9; a[4]=8;
        //방법 2 선언 정의 초기화
        int[] b = new int[]{2,5,3,9,8};
        //방법 3 선언 초기화
        int[] c = {2,5,3,9,8};
        //다시 대입 불가
        //c={2,5,3,9}
        int[] e = new int[5];
        Arrays.fill(e,-1);
        System.arraycopy(c,0,e,0,c.length);
        Arrays.sort(e);
        print(e);
        e=new int[]{1,2,3,4,5,6};
        print(e);
        int index = Arrays.binarySearch(e,5);
        System.out.println(index);
    }
    public static void print(int[] a){
        for(int i =9;i<a.length;i++){
            System.out.println(a[i]+"\t");
        }
        System.out.println();
    }
}
