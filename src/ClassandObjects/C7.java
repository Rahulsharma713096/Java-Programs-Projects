package ClassandObjects;
 class Demo3 {
	int a,b,c;
	int add()
	{
		a=10; b=20; c=a+b;
		return c;
	}
}
public class C7 {
public static void main(String[] args) {
	Demo3 x=new Demo3();
	int res=x.add();
	System.out.println(res);
	
}
}
