public class CompileTime{

    public  static int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public void greeting(){
        System.out.println("hii, im dead");
    }

    public static void main(String[] args){
        CompileTime comp = new CompileTime();

        int firstmethod = comp.add(20, 30);
        System.out.println(firstmethod);

        double secondmethod = comp.add(66.9, 88.5);
        System.out.println(secondmethod);

        int thirdmethod = comp.add(33, 55, 77);
        System.out.println(thirdmethod);

        comp.greeting();
    }
}
