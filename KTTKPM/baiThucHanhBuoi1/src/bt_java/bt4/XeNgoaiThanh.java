package bt_java.bt4;

public class XeNgoaiThanh extends ChuyenXe{
    private  String noiDen;
    private  int soNgayDi;


    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDi) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
                "noiDen=" + noiDen + '\n' +
                "soNgayDi=" + soNgayDi;
    }
}
