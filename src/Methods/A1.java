package Methods;
class Demo10 {
	void add(int x,float y)
	{
		float temp=x+y;
		System.out.println(temp);
	}
	float add(int a,float b,int c)
	{
		return a+b+c;
	}
	
}
public class A1 {
public static void main(String[] args) {
	
	Demo10 d=new Demo10();
	d.add(10, 20);
}
}
