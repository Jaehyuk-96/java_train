package chapter3.geoLocation;

import chapter3.geoLocation.Geo;

public class GeoPoint {
    public static void main(String[] args) {
        //인스턴스 변수생성
        double latitude1 = 37.52127220511242;
        double longtitude1= 127.0074462890625;
        double latitude2=35.137879119634185;
        double longtitude2=129.04541015625;

        Geo geo1 = new Geo();//객체생성
        geo1.latitude=latitude1;//객체전달
        geo1.longtitude=longtitude1;
        System.out.println(geo1.latitude+ "\t" + geo1.longtitude);

        Geo geo2 = new Geo();
        geo2.latitude=latitude2;
        geo2.longtitude=longtitude2;

        Geo geo = geo1;//객체전달
        System.out.println(geo.latitude+ "\t" + geo.longtitude);


    }
}
