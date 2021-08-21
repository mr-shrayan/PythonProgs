class Bus{
    void seat()
        {
            System.out.println("Superclass Seats=32");
        }
    class ElectricBus extends Bus 
    {
        void seat()
            {
                System.out.println("Subclass seats = 20");
            }
            void showInfo()
            {
                seat();
                this.seat();
            }
        
    }
    public class test{
    public static void main(String args[]){
        ElecteicBus eb = new ElectricBus();
        eb.showInfo();
    }
}