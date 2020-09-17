
package labassignment;

class Teacher{
     String tname;
     String subject;
    
    void t_display(){
        System.out.println("Teacher name = " + tname);
        System.out.println("Subject taught =" + subject);
    }

}

class Student extends Teacher{
    private String sname;
    private int roll;
    void setData(String student,String teacher,String sub,int r){
        sname=student;
        tname=teacher;
        subject=sub;
        roll=r;
    }
    void s_display(){
        System.out.println("Student name=" + sname);
        System.out.println("Student Roll=" + roll);
    }
    
}
public class Inheritance_Program {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Anusha Panta","Aman Maharjan", "Adanced Java Programming",10);
        s.t_display();
        System.out.println();
        s.s_display();
    }
    
}
