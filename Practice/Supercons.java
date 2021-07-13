
// class cons{
//     Vehicle()
//     {
//         System.out.println("Hi this is the owner");
//     }
// }
// class Supercons extends cons{
//     Bmw()
//     {
//         super();
//         System.out.println("Hi this is my Vehicle BMW");
//     }  
//     public static void main(String[] args) {
//         cons2 cons = new cons2();
//     }
    
// }

class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicle is created");
    }
}
class Supercons extends Vehicle{
    Supercons()
    {
        
        System.out.println("Bike is created");
    }
    public static void main(String[] args) {
        Supercons b = new Supercons();
    }
}
