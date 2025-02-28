package bt_java.bt3;

public class bt3_main {
    public static void main(String[] args) {

        SinhVienNTU sv1 = new SinhVienIT("Nguyễn Văn A", "CNTT", 8.5f, 7.0f, 9.0f);
        SinhVienNTU sv2 = new SinhVienBiz("Trần Thị B", "Kinh Tế", 7.5f, 8.0f);
        sv1.inThongTin();
        sv2.inThongTin();
    }
}
