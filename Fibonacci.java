package Week1.day1;

public class Fibonacci {
	public static void main(String[] args)
	{
	 int i1=0; 
	 int i2=1; 
	 System.out.println(i1);
	 System.out.println(i2);
	 int i3;
	 int a;
	 
	 for (a=1;a<=8;a++)
	  {
		  i3= i1+i2;
System.out.println(i3);
		  i1=i2;
		  i2=i3;
		
	    }
	 }
}
