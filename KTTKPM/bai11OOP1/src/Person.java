public class Person {
    protected String name,birth;

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }
    public void Greet(){
        System.out.println("Ham greet cua lop cha");
    }
    public String toString(){
        return  this.name+" "+this.birth;
    }
}
