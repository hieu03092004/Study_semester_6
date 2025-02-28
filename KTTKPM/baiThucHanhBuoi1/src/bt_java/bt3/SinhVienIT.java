package bt_java.bt3;

class SinhVienIT extends SinhVienNTU {
    private float diemJaVa,diemCSS,diemHTML;


    public SinhVienIT(String hoTen, String nganh, float diemJaVa, float diemCSS, float diemHTML) {
        super(hoTen, nganh);
        this.diemJaVa = diemJaVa;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }
    @Override
    public float getDiemTB() {
        return (diemJaVa * 2 + diemCSS + diemHTML) / 4;
    }
    @Override
    public void inThongTin(){
        super.inThongTin(); // Gọi phương thức từ lớp cha
        System.out.println("Java:" + diemJaVa +", CSS:" + diemCSS +", HTML:" + diemHTML);
        System.out.println("Điểm TB:"+this.getDiemTB());
        System.out.println("Học lực:"+this.getHocLuc());
    }


}