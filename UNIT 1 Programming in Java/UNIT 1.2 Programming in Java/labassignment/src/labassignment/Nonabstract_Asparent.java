package labassignment;

abstract class test{
    public abstract void demo();
}

class test1{
    void demo(int a){
        System.out.println("a:"+a);
    }
}

class test2 extends test1{
    void demo(int a,int b){
        System.out.println("a :"+a +"\tb :"+b);
        
    }
}

public class Nonabstract_Asparent {
    public static void main(String[] args) {
        test2 t2=new test2();
        t2.demo(100);
        t2.demo(100, 200);
    }
}
