package bt_java.bt4;

import bt_java.bt1.QuanLyNhanVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe>dsCX;
    QuanLyChuyenXe(){
        dsCX=new ArrayList<ChuyenXe>();
    }
    public void them(ChuyenXe cx){
       dsCX.add(cx);
    }
    public double tongDoanhThuXNT(){
        double sum=0;
        for(ChuyenXe cx:dsCX){
            if(cx instanceof XeNoiThanh)
                sum+=cx.doanhThu;
        }
        return  sum;
    }
    public double tongDoanhThuXNGT(){
        double sum=0;
        for(ChuyenXe cx:dsCX){
            if(cx instanceof XeNgoaiThanh)
                sum+=cx.doanhThu;
        }
        return  sum;
    }
    public double TongDoanhThuCa2Xe(){
        return  this.tongDoanhThuXNGT()+tongDoanhThuXNT();
    }

    public List<ChuyenXe> getDsCX() {
        return dsCX;
    }
}
