package creational.singleton.vidu;

public class MainSingelton {
    public static void main(String[] args) {
        MySingleton s1=MySingleton.getInstance();
        MySingleton s2=MySingleton.getInstance();
        s1.display();
        //output:1;
        s2.display();
        //output:2
        s1.display();
        s2.display();

    }

}
