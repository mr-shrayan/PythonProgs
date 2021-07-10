class HIT{
    String addr;
    int stu;
    void address(String addr){
        this.addr = addr;
    }
    String getAddress(){
        return addr;
    }

    void student(int stu){
        this.stu = stu;
    }
    int getStudent(){
        return (stu);
    }
}

class CSE extends HIT{
    String lab;
    void lab(String lab){
        this.lab = lab;
    }
    String getLab(){
        return (lab);
    }
}
class ECE extends HIT{
    String lab;
    void lab(String lab){
        this.lab = lab;
    }
    String getLab(){
        return (lab);
    }
}



class HierarchialInheritance {
    public static void main(String[] args){
        CSE c = new CSE();
        ECE e = new ECE();

        c.address("Haldia HIT CSE DEPT");
        c.student(70);
        c.lab("OOP LAB");

        e.address("Haldia HIT ECE DEPT");
        e.student(70);
        e.lab("ECE LAB");

        System.out.println("CSE DEPT:");
        System.out.println("Address = "+c.getAddress());
        System.out.println("Number of students = "+c.getStudent());
        System.out.println("Lab name  = "+c.getLab());

        System.out.println("ECE DEPT:");
        System.out.println("Address = "+e.getAddress());
        System.out.println("Number of students = "+e.getStudent());
        System.out.println("Lab name  = "+e.getLab());
    }
}
