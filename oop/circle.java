public class circle implements Shape {

    double radius;

    circle(double radius){
        //this is the constructor and it has the same name as the class name
        this.radius = radius;
    }

    public double area(){
        //below is the implementation of the method
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
    
    public static void main(String[] args){
        //shape contains the abstract method we are trying to use
        Shape cir = new circle(5.5);

        double result = cir.area();
        System.out.println(result);
            //or
        System.out.println("the area is " + cir.area());

        double result1 = cir.perimeter();
        System.out.println(result1);
    }
}
