class A{
    void show(){
        System.out.println("Hello From A");
    }
    int show(int x){
        System.out.println("Overloading from a "+x);
        return 0;
    }
}

class B extends A{
    void show(){
        System.out.println("Hello from B");
    }
}

class TwoInOne {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        obj.show();
        obj2.show(20);
        obj2.show();
    }
}
