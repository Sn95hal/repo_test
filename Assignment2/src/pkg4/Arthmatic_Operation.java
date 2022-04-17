package pkg4;

public class Arthmatic_Operation 
{
	public int sum(int a,int b)// local  var
	  {
		  int c;
		  c= a+b;
		  System.out.println("sum result is:" +c);
		  return c;
	  }	 
	public int sub(int a1,int b1)
	  {
		  int c1;
		  c1= a1-b1;
		  System.out.println("sub result is:" +c1);
		  return c1;
	  }	 
	public int mul(int a2,int b2)
	  {
		  int c2;
		  c2= a2*b2;
		  System.out.println("mul result is:" +c2);
		  return c2;
	  }
	public int div(int a3,int b3)
	  {
		  int c3;
		  c3= a3/b3;
		  System.out.println("div result is:" +c3);
		  return c3;
	  }
	public static void main(String[] args) 
	{
		Arthmatic_Operation ref= new Arthmatic_Operation();
		int sumresult= ref.sum(10, 2);
		int subresult= ref.sub(sumresult, 2);
		int sumresult1= ref.sum(subresult, 2);
		int mulresult= ref.mul(sumresult1, 2);
		ref.div(mulresult, 2);
		
	}
}
