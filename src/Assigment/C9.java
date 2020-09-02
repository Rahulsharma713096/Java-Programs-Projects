package Assigment;

public class C9 {
public static void main(String[] args) {
	//Cap of King or crown
	int n=10;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=50-i-1;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=2;j<=i;j++)
		{
			System.out.print("*");
		}
System.out.println();
}
	//Face of king
	n+=20;
	for(int i=1;i<=n-10;i++) {
		for(int j=1;j<=n+8;j++) {
			System.out.print(" ");}
		for(int j=1;j<=n-10;j++) { if((i==5&& j==5)||(i==5&& j==6)||(i==6&& j==5)||(i==6&& j==6)||(i==5&& j==15)||(i==5&& j==16)||(i==6&& j==15)||(i==6&& j==16))  System.out.print(" ");
		else if((i==11&&j==5)||(i==12&&j==6)||(i==13&&j==7)||(i==14&&j==8)||(i==15&&j==9)||(i==16&&j==10)) System.out.print("_");
		else if((i==16&&j==11)||(i==15&&j==12)||(i==14&&j==13)||(i==13&&j==14)||(i==12&&j==15)||(i==11&&j==16)) System.out.print("_");
		else if((i==7&&j==10)||(i==7&&j==11)||(i==8&&j==10)||(i==8&&j==11)||(i==9&&j==10)||(i==9&&j==11) ) System.out.print("|");
		else	System.out.print("*");
		}
	System.out.println();
	}
	// Body of King
	n+=20;
	for(int i=1;i<=30;i++) {
		for(int j=1;j<=n-22;j++) {// left arm
if((i==1&&j==28)||(i==2&&j==27)||(i==3&&j==26)||(i==4&&j==25)||(i==5&&j==24)||(i==6&&j==23)||(i==7&&j==22)||(i==8&&j==21)||(i==9&&j==20)||(i==10&&j==19)) System.out.print("*");
else if((i==2&&j==28)||(i==3&&j==27)||(i==4&&j==26)||(i==5&&j==25)||(i==6&&j==24)||(i==7&&j==23)||(i==8&&j==22)||(i==9&&j==21)||(i==10&&j==20)||(i==11&&j==19)) System.out.print("*");
else if((i==3&&j==28)||(i==4&&j==27)||(i==5&&j==26)||(i==6&&j==25)||(i==7&&j==24)||(i==8&&j==23)||(i==9&&j==22)||(i==10&&j==21)||(i==11&&j==20)||(i==12&&j==19)) System.out.print("*");
		else	System.out.print(" ");}
		for(int j=1;j<=n-10;j++) {  //shirt buttons
			if((i==5&&j==20)||(i==10&&j==20)||(i==15&&j==20)||(i==20&&j==20)||(i==22&&j==20)) System.out.print("@");
		else 	System.out.print("*");
		}
		for(int j=n-21;j<=58;j++) {  //right arm
if((i==1&&j==29)||(i==2&&j==30)||(i==3&&j==31)||(i==4&&j==32)||(i==5&&j==33)||(i==6&&j==34)||(i==7&&j==35)||(i==8&&j==36)||(i==9&&j==37)||(i==10&&j==38)) System.out.print("*");
else if((i==2&&j==29)||(i==3&&j==30)||(i==4&&j==31)||(i==5&&j==32)||(i==6&&j==33)||(i==7&&j==34)||(i==8&&j==35)||(i==9&&j==36)||(i==10&&j==37)||(i==11&&j==38)) System.out.print("*");
else if((i==3&&j==29)||(i==4&&j==30)||(i==5&&j==31)||(i==6&&j==32)||(i==7&&j==33)||(i==8&&j==34)||(i==9&&j==35)||(i==10&&j==36)||(i==11&&j==37)||(i==12&&j==38)) System.out.print("*");
			else System.out.print(" ");
			}
	System.out.println();
	}
	//lower body or legs
	for(int i=1;i<=30;i++) {
		for(int j=1;j<=n-22;j++) { 
		System.out.print(" ");   
		}
		for(int j=1;j<=n-10;j++) {
			if(j==1||j==2||j==3||j==4||j==40||j==39||j==38||j==37)
			System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
	}
	
		
}
}
