import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        NhanVien nv=new NhanVien("NV001",sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine());
//        System.out.println(nv.getPhuCap());
//        System.out.println(nv.getLuong());
//        System.out.println(nv.getThuong());
//        System.out.println(nv);
//        ThiSinh t=new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
//        System.out.println(t);
//        Student s=new Student("CNTT1",2.5,"Teo","22/12/2003");
////        s.Greet();
//        System.out.println(s);
//        GeometricObject o1=new Circle("Red",false,30);
//        GeometricObject o2=new Rectangle("Blue",true,20,30);
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        Shape [] a=new Shape[n];
//        for(int i=0;i<n;i++){
//            String s=sc.next();
//            if(s.equals("C")){
//                double r=sc.nextDouble();
//                String Color=sc.next();
//                boolean filled=sc.nextBoolean();
//                a[i]=new Circle(filled,Color,r);
//            }
//            else if(s.equals("R")){
//                double w=sc.nextDouble();
//                double l=sc.nextDouble();
//                String Color=sc.next();
//                boolean filled=sc.nextBoolean();
//                a[i]=new Rectangle(filled,Color,Math.max(w,l),Math.min(w,l));
//            }
//            else{
//                double side=sc.nextDouble();
//                String Color=sc.next();
//                boolean filled=sc.nextBoolean();
//                a[i]=new Square(filled,Color,side,side);
//            }
//        }
//        System.out.println("Circle : ");
//        for(int i=0;i<n;i++){
//            if(a[i] instanceof Circle){
//                System.out.print(a[i]);
//            }
//        }
//        System.out.println("Rectangle : ");
//        for(int i=0;i<n;i++){
//            if(a[i] instanceof Rectangle && !(a[i] instanceof Square)){
//                System.out.print(a[i]);
//            }
//        }
//        System.out.println("Square : ");
//        for(int i=0;i<n;i++){
//            if(a[i] instanceof Square){
//                System.out.print(a[i]);
//            }
//        }
//        Bird bird = new Bird();
//        bird.Fly();
//        bird.run();
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        //sc.nextLine() de doc nguyen xau do
//        System.out.println(s);
        // cach xu ly troi lenh trong java
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();//doc ki tu enter trong bo dem ban phim
        String s=sc.nextLine();
        //sc.nextLine() doc lun phim Enter
        String t=sc.nextLine();
        System.out.println(n);
        System.out.println(s);
        for(int i=0;i<s.length();i++)
            System.out.print(s.charAt(i)+" ");
    }
}