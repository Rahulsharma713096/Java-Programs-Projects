package HasA;
class Heart
{
	int heartbeat;
	public Heart(int heartbeat) {
		this.heartbeat=heartbeat;
	}
	public int getHeartbeat() {
		return heartbeat;
	}
	
}
class Brain
{
	int iq;
	public Brain(int iq) {
		this.iq=iq;
	}
	public int getiq() {
		return iq;
	}
	}
class Bike
{
	int milage;
	public Bike(int milage) {
		this.milage=milage;
	}
	public int getmilage() {
		return milage;
	}
	
}
class Books
{
	int pgnos;
	public Books(int pgnos) {
		this.pgnos=pgnos;
	}
	public int getpgnos() {
		return pgnos;
	}
	
}
class Human
{
	Heart hr=new Heart(72);
	Brain br=new Brain(120);
	}
class Student extends Human
{
	void hasA(Bike bi) {
		System.out.println(bi.getmilage());
		
	}
	void hasA(Books bo) {
		System.out.println(bo.getpgnos());
	}
	}
public class H1 {
public static void main(String[] args) {
	Student s=new Student();
	Books bo=new Books(100);
	Bike bi=new Bike(65);
	System.out.println(s.hr.getHeartbeat());
	System.out.println(s.br.getiq());
	System.out.println(bo.getpgnos());
	System.out.println(bi.getmilage());
	System.out.println("--------------------------------------------------------------");
	s.hasA(bi);
	s.hasA(bo);
	System.out.println("--------------------------------------------------------------");
	Human Hu=new Student();
	System.out.println(Hu.hr.getHeartbeat());
	System.out.println(Hu.br.getiq());
	System.out.println(bo.getpgnos());
	System.out.println(bi.getmilage());
	System.out.println(Hu.getClass());
	
}
}