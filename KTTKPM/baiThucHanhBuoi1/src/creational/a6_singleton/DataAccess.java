package creational.a6_singleton;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    List<SanPham>dsSP;
    private DataAccess() {
        dsSP=new ArrayList<SanPham>();
    }
    public static DataAccess getInstance() {
        if (instance == null) {
            instance = new DataAccess();
        }
        return instance;
    }
    void Them(SanPham s){
        dsSP.add(s);
    }
    public void inKQ(){
        for(SanPham s:dsSP){
            System.out.println(s);
        }
    }
}
