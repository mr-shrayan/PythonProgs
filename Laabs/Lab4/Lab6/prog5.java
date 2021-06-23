class CalculateBill
{	
	double billpay;
 
	void Bill(long units)
	{
  	  if(units<100)
		billpay=units*1.20;
	  else if(units<=300)
		billpay=100*1.20+(units-100)*2;
	  else if(units>300)
		billpay=100*1.20+200 *2+(units-300)*3;
	     
         }	 
 
	
}
class prog5 extends CalculateBill
{ 
        public static void main(String args[]) 
        {   
	    long units;
 
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("Enter number of units");
	   
                  units=sc.nextLong();
 
            class CalculateBill
{	
	double billpay;
 
	void Bill(long units)
	{
  	  if(units<100)
		billpay=units*1.20;
	  else if(units<=300)
		billpay=100*1.20+(units-100)*2;
	  else if(units>300)
		billpay=100*1.20+200 *2+(units-300)*3;
	     
         }	 
 
	
}
class prog5 extends CalculateBill
{ 
        public static void main(String args[]) 
        {   
	    long units;
 
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("Enter number of units");
	   
                  units=sc.nextLong();
 
                  prog5 b=new prog5();
            b.Bill(units);
        	
      	    System.out.println("Bill to pay : " + b.billpay); 
   } 
} b=new prog5();
            b.Bill(units);
        	
      	    System.out.println("Bill to pay : " + b.billpay); 
   } 
}