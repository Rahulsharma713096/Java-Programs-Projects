package ClassandObjects;

public class C9 {
	public static void main(String[] args) {
		Tiger t=new Tiger();
	t.dip();
	t.disp1();
	t.disp2();
		
	}

}

class Animal {
	void dip() {
	System.out.println("Dis method in class Animal");

	}
	int disp1() {
		System.out.println("Disp1 method in class Animal");
return 1;
	}
}
class Tiger extends Animal
{
	void disp2() {
	System.out.println("Tiger class");
	}
}