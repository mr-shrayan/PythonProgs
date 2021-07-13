class commercial {
    private String name;
    void setname(String name){
        this.name =name;
    }
    String getname(){
        return name;
    }
    void calcualtebill(int units){
        System.out.println("Enter the name of the consumer"+getname());
        System.out.println("Bill amount"+ units *5.00);
    }
}
class domestic extends commercial{
    void calcualtebill(int units){
        System.out.println("Enter the name of the consumer"+getname());
        System.out.println("Bill amount"+ units *2.50);
    }
}

public class Bill {
    public static void main(String[] args) {
        commercial c = new commercial();
        c.setname("Ajay");
        c.calcualtebill(100);
        domestic d = new domestic();
        d.setname("Roy");
        d.calcualtebill(100);

    }
}
