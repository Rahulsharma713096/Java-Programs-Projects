package ClassandObjects;
 class Demo5 {
	int temp;
	int add(int x,int y)
	{
		temp=x+y;
		return temp;
	
	}
}
public class C8 {
public static void main(String[] args) {
	Demo5 x=new Demo5();
	int a,b,res;
	a=10; b=20; res= x.add(a,b);
	System.out.println(res);
}
}
