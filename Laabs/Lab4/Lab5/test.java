class test {

    // this method accepts int
    private static int display(int a,int b){
        System.out.println("Got Integer data.");
        return 0;
    }

    // this method  accepts String object
    private static float display(int a,int b){
        System.out.println("Got String object.");
        float sum = 5.0f+4.2f;
        return sum;
    }

    public static void main(String[] args) {
        display(1,2);
        display(1,2);
    }
}