public class NhanVien {
    private String ma,hoTen;
    private int luongCoBan,ngayCong;
    private String chucVu;

    public NhanVien(String ma, String hoTen, int luongCoBan, int ngayCong, String chucVu) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }
    public int getLuong(){
        return  this.luongCoBan*this.ngayCong;
    }
    public int getThuong(){
        int luong=this.getLuong();
        if(this.ngayCong>=25)
            return (int)(0.2*luong);
        else if(this.ngayCong>=22)
            return (int)(0.1*luong);
        else
            return 0;
    }
    public int getPhuCap(){
        if(this.chucVu.equals("GD"))
            return 250000;
        else if(this.chucVu.equals("PGD"))
            return 200000;
        else if(this.chucVu.equals("TP"))
            return 180000;
        return  150000;
    }
    public String toString(){
        return  this.ma+" "+this.hoTen+" "+this.getLuong()+" "+this.getThuong()+" "+this.getPhuCap()+" "+(this.getLuong()+this.getPhuCap()+this.getThuong());
    }
}
