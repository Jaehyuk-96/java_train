public class BioRandom {
    public static void main(String[] args) {
        int range = 10;//range 값 초기화
        int start =1;//start 값초기화
        int a = 0 , b=0, c=0; //인트값 초기화
        while(true){
            a=(int)(range*Math.random()+start);//math random 값곱함
            b=(int)(range*Math.random()+start);
            c=(int)(range*Math.random()+start);
            if(a!=b && b!=c && c!=a)break; //a랑 b랑 c가 모두 다를때 출력
        }
        System.out.printf("%d\t%d\t%d",a,b,c);
    }
}
