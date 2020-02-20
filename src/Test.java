

public class Test {
    public static void main(String[] args) {

        Triangle triangle=new Triangle();
        System.out.println(triangle);
        triangle=new Triangle(2,3,4,"red",true);
        System.out.println(triangle);
        System.out.println("dien tich:"+triangle.getArea());
        System.out.println("chu vi:"+triangle.getPerimeter());




    }
}
