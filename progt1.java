class progt1{
    public void display (int x, double y){
        System.out.println(x+y);

    }
    public double display (int p, double q){
        return (p+q);

    }    public static void main (String args[]){

        progt1 test = new progt1 ;
        test.display(4, 5.0);
        System.out.println(progt1.display(4, 5.0));
    }
       

    }