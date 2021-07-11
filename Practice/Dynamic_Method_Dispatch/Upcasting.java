class one{
    void see(){
        System.out.println("Hey I am one");
    }
}
class two extends one{
    void see(){
        System.out.println("Hey I am two");
    }
}

class Upcasting {
    public static void main(String args[]){
    one a = new one();
    a.see();
    a.see();
    a = new two();
    a.see();
    a.see();
    }
}
