package labassignment;

public class Encapsulation_Program {

    private String name;
    private String college;
    private int phone;

    public String getname() {
        return name;
    }

    public String getcollegename() {
        return college;
    }

    public int getphone() {
        return phone;
    }

    public void setname(String sname) {
        name = sname;
    }

    public void setcollegename(String scollege) {
        college = scollege;
    }

    public void setphone(int sphone) {
        phone = sphone;
    }
    
    public static void main(String[] args) {
        Encapsulation_Program e = new Encapsulation_Program();
        e.setname("Anusha");
        e.setcollegename("Trinity");
        e.setphone(4445958);
        System.out.println("Name of the student :"+ e.getname());
        System.out.println("College :"+ e.getcollegename());
        System.out.println("College_PhoneNumber :"+ e.getphone());
        
    }

}
