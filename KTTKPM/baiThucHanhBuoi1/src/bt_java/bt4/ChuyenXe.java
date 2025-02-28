package bt_java.bt4;

public class ChuyenXe {
    protected String maSoChuyen,hoTenTaiXe,soXe;
    protected  double doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    @Override
    public String toString() {
        return
                "maSoChuyen=" + maSoChuyen + '\n' +
                "hoTenTaiXe=" + hoTenTaiXe + '\n' +
                "soXe=" + soXe + '\n' +
                "doanhThu=" + doanhThu ;
    }
}
