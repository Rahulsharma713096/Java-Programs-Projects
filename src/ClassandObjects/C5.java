package ClassandObjects;
 class Demo1 {
	int a,b,c;
	void add()
	{
		a=10; b=20; c=a+b;
		System.out.println(c);
	}
}
public class C5 {
public static void main(String[] args) {
	Demo1 x=new Demo1();
	x.add();
}
}
