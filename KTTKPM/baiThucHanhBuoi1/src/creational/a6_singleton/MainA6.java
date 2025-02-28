package creational.a6_singleton;

public class MainA6 {
    public static void main(String[] args) {
            DataAccess d1=DataAccess.getInstance();
            SanPham sp=new SanPham("SP001","Test",2,4);
            d1.Them(sp);
            //d1.inKQ();
            DataAccess d2=DataAccess.getInstance();
            SanPham sp2=new SanPham("SP002","Test2",2,4);
            d2.Them(sp2);
            d1.inKQ();

    }
}
