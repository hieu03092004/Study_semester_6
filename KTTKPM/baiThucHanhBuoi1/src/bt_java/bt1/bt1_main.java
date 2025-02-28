package bt_java.bt1;

public class bt1_main {
    public static void main(String[] args) {
//        NhanVien nv1=new NhanVien("Test","HaNoi",20,2,20.1);
//        System.out.println(nv1);
//        NhanVien nv2=new NhanVien("Test2","NhaTrang",21,100,20.2);
//        System.out.println(nv2);
        QuanLyNhanVien qlnv=new QuanLyNhanVien();
        qlnv.them(new NhanVien("SV001","Diachi1",20,100,19));
        qlnv.them(new NhanVien("SV002","Diachi2",21,101,20));
        qlnv.them(new NhanVien("SV003","Diachi3",22,102,21));
        qlnv.them(new NhanVien("SV004","Diachi4",23,103,22));
        qlnv.them(new NhanVien("SV005","Diachi5",24,104,23));
        qlnv.inDS();

    }
}
