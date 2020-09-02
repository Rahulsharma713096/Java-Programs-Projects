package InheritanceConcept;

public class I1 {
	public static void main(String[] args) {
		System.out.println("Inheritance Program");
		Demo2 d=new Demo2();
		d.display();
	}

}
class Demo1
{
int a,b;
Demo1(){
	a=10;
	b=20;
}
Demo1(int n,int m){
	a=m;b=n;
}
}
class Demo2 extends Demo1{
	int c,d;
	Demo2(){
		c=30;d=40;
	}
	Demo2(int x,int y){
		c=x; d=y;
	}
	void display() {
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
	}
}