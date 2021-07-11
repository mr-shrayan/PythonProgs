class A{
    void show(){
        System.out.println("World");
    }
    void display(){
        System.out.println("India");
    }
}
class B extends A{
    void show(){
        System.out.println("usa");
    }
}
class C extends A{
    void display(){
        System.out.println("Russia");
    }
}
class Dmd {
    public static void main(String args[]){
    A a = new A();
    B b = new B();
    C c = new C();

    a.show();
    a.display();

    a = b;
    a.show();
    a.display();

    a = c;
    a.show();
    a.display();
    }
}
