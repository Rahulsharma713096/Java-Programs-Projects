package Encapsulation;
class Books {
	private int pg;
	void setData(int x) {
	if(x>0)	pg=x;
	
	else {
		System.out.println("Invalid Data");
		System.exit(0);
	} }
	int getData() {
		return pg;
	}

}
public class E1 {

}
