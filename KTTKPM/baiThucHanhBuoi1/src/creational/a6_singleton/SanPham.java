package creational.a6_singleton;

public class SanPham {
    String id,ten;
    int sl,donGia;

    public SanPham(String id, String ten, int sl, int donGia) {
        this.id = id;
        this.ten = ten;
        this.sl = sl;
        this.donGia = donGia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return
                "id=" + id + '\n' +
                "ten=" + ten + '\n' +
                "sl=" + sl +"\n"+
                "donGia=" + donGia;
    }
}
