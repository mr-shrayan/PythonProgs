class Outer {
    // Simple nested inner class
    protected class Inner {
        public void show() {
            System.out.println("In a nested class method");
        }
    }
    }
    class Prog4 {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
    }
    
    