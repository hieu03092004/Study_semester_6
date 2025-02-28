package creational.builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer=new Computer.Builder()
                .buildCPU("Intel i5")
                .buildRam("8GB")
                .buildStorage("1TB")
                .buildScreen("15.6 inch").build();
        System.out.println(computer);
    }
}
