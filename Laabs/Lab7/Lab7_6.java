/*WAP to calculate volume of a sphere and a cone using
interface.*/

interface Shape {
    float pi = 3.14f;

    void volume(int a, int b);
}

class Sphere implements Shape {

    public void volume(int a, int b) {
        float vol_sphere = (float) (4 / 3) * pi * a * a * a;
        System.out.println("Volume of Sphere is " + vol_sphere);
    }
}

class Cone implements Shape {

    public void volume(int a, int b) {
        float vol_cone = (float) (b / 3) * pi * a * a;
        System.out.println("Volume of cone is " + vol_cone);
    }
}

class Lab7_6 {

    public static void main(String args[]) {
        Sphere objS = new Sphere();
        objS.volume(3, 5);

        Cone objC = new Cone();
        objC.volume(4, 13);
    }
}
