package bt_java.bt1;

public class NhanVien {
    private String ten,diaChi;
    private  int tuoi,tongSoGioLam;
    private double tienLuong;

    public NhanVien(String ten, String diaChi, int tuoi, int tongSoGioLam, double tienLuong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tongSoGioLam = tongSoGioLam;
        this.tienLuong = tienLuong;
    }
    public double tinhThuong(){
        if(this.tongSoGioLam>=200)
            return this.tienLuong*0.2;
        else if(this.tongSoGioLam>=100 && this.tongSoGioLam<200)
            return  this.tienLuong*0.1;
        else
            return  0;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    @Override
    public String toString() {
        return
            "ten=" + ten + '\n' +
            "diaChi=" + diaChi + '\n' +
            "tuoi=" + tuoi +"\n"+
            "tongSoGioLam=" + tongSoGioLam +"\n"+
            "tienLuong=" + (tienLuong +this.tinhThuong());
    }
}