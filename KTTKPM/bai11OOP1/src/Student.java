public class Student extends Person {
    private String lop;
    private double gpa;

    public Student(String lop, double gpa,String name,String birth) {
        super(name,birth);
        this.lop = lop;
        this.gpa = gpa;
    }
    public void Greet(){
        System.out.println("Ham greet cua lop Student");
    }
    public String toString(){
        return this.name+" "+this.birth+" "+this.lop+" "+this.gpa;
    }
}
