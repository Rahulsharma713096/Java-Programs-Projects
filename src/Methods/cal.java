package Methods;
class calculator {
	int add(int a,int b)
	{
		return a+b;
	}
	float add(int a,float b)
	{
		return a+b;
	}
	float add(float a,int b)
	{
		return a+b;
	}
	double add(int a,double b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	double add(int a,float b,double c)
	{
		return a+b+c;
	}
	float add(int a,float b,float c)
	{
		return a+b+c;
	}
}
public class cal {
public static void main(String[] args) {
	int a=10,b=20;
	float m=15.5f,n=25.5f;
	double x=35.0;
	calculator x1=new calculator();
	System.out.println(x1.add(a, b));
	System.out.println(x1.add(a, m,x));
	System.out.println(x1.add(a, m,n));
	System.out.println(x1.add(a, m));
}
}
