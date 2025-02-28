package bt_java.bt4;

public class bt4_main {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx=new QuanLyChuyenXe();
        XeNoiThanh xnt=new XeNoiThanh("NT001","TXNT001","NT123",8,"TNT001",10);
        qlcx.them(xnt);
        XeNgoaiThanh xngt=new XeNgoaiThanh("NGT001","TXNGTH001","XNGT001",10,"HN",20);
        qlcx.them(xngt);

        for(ChuyenXe cx: qlcx.getDsCX())
            System.out.println(cx);
        System.out.println("Tong doanh thu xe noi thanh:" +qlcx.tongDoanhThuXNT());
        System.out.println("Tong doanh thu xe ngoai thanh:"+qlcx.tongDoanhThuXNGT());
        System.out.println("Tong doanh thu ca 2 xe:"+qlcx.TongDoanhThuCa2Xe());
    }
}
