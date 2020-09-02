package JavaClassAssignments;
class Animal{
	void eat()
	{
		System.out.println("Animal Eating Food");
	}
	void sleep()
	{
		System.out.println("Aminal  Sleep");
	}
	void breath()
	{
		System.out.println("Aminal Breathing");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Tiger Hunts Food");
	}
}
class Deer extends Animal
{
	void eat()
	{
		System.out.println("Deer Grazing Food");
	}
}
class Monkey extends Animal
{
	void eat()
	{
		System.out.println("Monkey Snaching  Food");
	}
}
public class AnimalAssig {
public static void main(String[] args) {
	Tiger T=new Tiger();
	Deer D=new Deer();
	Monkey M=new Monkey();
	T.eat();
	T.sleep();
	T.breath();
	System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ __ _ _ _ _ __ __ _ __ _ ___ _ _ __ __ ___ _____  __ __ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	D.eat();
	D.sleep();
	D.breath();
	System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ __ _ __ _ __ __ _ _ _ _ _");
	M.eat();
	M.sleep();
	M.breath();
}
}
