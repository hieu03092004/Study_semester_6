package behavioral.stratery.duck_example;

public class VitQuay extends  Duck{

    public VitQuay(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Day la ham hien thi class Vit Quay");
        swim();
        performFLy();
        performQuack();
        System.out.println("Chuc ban ngon mieng");
    }
}
