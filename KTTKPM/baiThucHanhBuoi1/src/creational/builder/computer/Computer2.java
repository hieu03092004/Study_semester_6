package creational.builder.computer;

public class Computer2 {
    String cpu,ram,storage,screen;
    private Computer2(Builder p){
        this.cpu=p.cpu;
        this.ram=p.ram;
        this.screen=p.screen;
        this.storage=p.storage;
    }
    public static class Builder{
        String cpu,ram,storage,screen;
        public Builder buildCPU(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder buildRam(String ram){
            this.ram=ram;
            return this;
        }
        public Computer2 build(){
            return new Computer2(this);
        }
    }
}
