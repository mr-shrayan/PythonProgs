/*Find the area of a square, rectangle and triangle using method
overloading.*/
class Area
{
    void calculateArea(float x)
    {
        System.out.println("Area of the square: "+x*x+" sq units");
    }
    void calculateArea(float x, float y)
    {
        System.out.println("Area of the rectangle: "+x*y+" sq units");
    }
    void calculateArea(int a, int b)
    {
        double area = (a*b)/2;
        System.out.println("Area of the triangle is: "+area+" sq units");
    }
    public static void main(String args[]){
        Area obj = new Area();

	 obj.calculateArea(6.1f); //f suffix for float
	 obj.calculateArea(10f,22f);
	 obj.calculateArea(6, 4);
    }
}