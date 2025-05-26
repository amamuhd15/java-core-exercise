import packageOne.packOne;
public class csc extends Faculty{
    public static void main(String[] args){
        Faculty fa = new Faculty();
        packOne pn = new packOne();
        System.out.println("Computer Science is in the faculty of " + fa.sname);
        System.out.println("the number of courses is " + pn.age);
        System.out.println(pn.name);
        fa.course();
        Faculty.course();
        pn.addornment();

    }


}
