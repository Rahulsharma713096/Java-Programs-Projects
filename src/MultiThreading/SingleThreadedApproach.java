package MultiThreading;
class Demo1
{
public void banking()throws Exception
{ System.out.println("banking activity started");
System.out.println("enter the account number");
System.out.println("enter the password");
Thread.sleep(5000);//------->5 secs of delay
System.out.println("Collect your money");
System.out.println("banking activity completed");
}
}
class Demo2
{
public void numPrinting()throws Exception
{
System.out.println("number Printing activity started");
for(int i=1;i<=5;i++)
{
System.out.println(i);
Thread.sleep(3000);//--------->3 secs of delay after printing each number
}
System.out.println("number Printing activity completed");
}
}
class Demo3
{
public void charPrinting()throws Exception
{
System.out.println("character Printing activity started");
for(int i=65;i<=70;i++)
{
System.out.println((char)i);
Thread.sleep(3000);//--------->3 secs of delay after printing each character
}
System.out.println("character Printing activity completed");
}
}
public class SingleThreadedApproach {
	public static void main(String[] args) throws Exception
	{
	Demo1 d1=new Demo1();
	Demo2 d2=new Demo2();
	Demo3 d3=new Demo3();
	d1.banking();
	d2.numPrinting();
	d3.charPrinting();
	}
}