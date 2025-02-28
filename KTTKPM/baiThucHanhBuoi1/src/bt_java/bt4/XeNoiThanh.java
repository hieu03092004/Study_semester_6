package bt_java.bt4;

public class XeNoiThanh extends ChuyenXe{
    private  String soTuyen;
    private  int soKmDiDuoc;

    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, int soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
                "soTuyen=" + soTuyen + '\n' +
                "soKmDiDuoc=" + soKmDiDuoc ;
    }
}
