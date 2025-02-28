package bt_java.bt1;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien  implements  IQuanLy{
    List<NhanVien>dsNV;
    QuanLyNhanVien(){
        dsNV=new ArrayList<NhanVien>();
    }

    @Override
    public void inDS() {
        for(NhanVien nv:dsNV)
            System.out.println(nv);
    }

    @Override
    public void them(NhanVien nv) {
        dsNV.add(nv);
    }
}
