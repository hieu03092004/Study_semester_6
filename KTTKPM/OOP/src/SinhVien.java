public class SinhVien {
    private String name;
    private String birth;
    private double gpa;
    private static int soLuong=0;
    SinhVien(String name,String birth,double gpa){
        this.soLuong++;
        this.name=name;
        this.birth=birth;
        this.gpa=gpa;
    }
    SinhVien(){
        this.soLuong++;
    }
    public String getName() {
        return name;
    }
    public static  int getSoLuong(){
        return  soLuong;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public double getGpa(){
        return this.gpa;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
//    public String toString(){
//        return "ABCD";
//    }
    //phuong thuc toString trong java
    public String toString(){
        return  this.name+" "+this.birth+" "+this.gpa;
    }
    public void display(){
        System.out.println(name+" "+birth+" ");
        System.out.printf("%.1f",gpa);
    }
}
