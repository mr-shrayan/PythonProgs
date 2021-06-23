class Parent {

    Parent() {
        System.out.println("Constructor of parent class");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Hello from inheritted class");
    }
}

class prog6 {
    public static void main(String[] args) {
        Child s = new Child();
    }
}