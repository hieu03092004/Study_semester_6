package creational.singleton.vidu;

public class MySingleton {
    //b1 doc de
    private static MySingleton instance;
    int count=0;
    //b2 Code
    private MySingleton(){

    };
    //b3 Lum
    public static MySingleton getInstance(){
        if(instance==null)
            instance=new MySingleton();
        return instance;
    };
    public void display(){
        System.out.println(++count);
    }
}
