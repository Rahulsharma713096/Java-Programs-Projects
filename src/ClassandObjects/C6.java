package ClassandObjects;
 class Demo2 {
	int temp;
	void add(int x,int y)
	{
		temp=x+y;
		System.out.println(temp);
	}
}
public class C6 {
public static void main(String[] args) {
	Demo2 x=new Demo2();
	int a,b;
	a=10; b=20; x.add(a,b);
}
}
