public class Bird implements Flyable, Runable {

    @Override
    public void Fly() {
        System.out.println("Bird Fly");
    }

    @Override
    public void run() {
        System.out.println("Bird run");
    }
}
