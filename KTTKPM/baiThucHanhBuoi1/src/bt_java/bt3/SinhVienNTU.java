package bt_java.bt3;

abstract class SinhVienNTU {
    private String hoTen;
    private  String nganh;

    public SinhVienNTU(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public abstract float getDiemTB();
    public  String getHocLuc(){
        float diemTB = getDiemTB();
        if (diemTB > 9)
            return "Xuất sắc";
        else if (diemTB >= 8.0)
            return "Giỏi";
        else if (diemTB >= 7.0)
            return "Khá";
        else if (diemTB >= 5)
            return "Trung bình";
        else return "Yếu";
    };

    public void inThongTin(){
        System.out.println("Họ tên:"+hoTen +"\n"+"Ngành:"+nganh);
    };

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
}
