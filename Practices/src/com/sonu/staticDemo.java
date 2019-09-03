package com.sonu;
class emp{
int eid;
int esal;
static String ceo;

public void show()
{
	System.out.println(eid+":"+esal+":"+ceo);
}
		
}

public class staticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
emp harry=new emp();
harry.eid=10;
harry.esal=22000;
harry.ceo="mukesh";
emp sonu=new emp();
sonu.eid=10;
sonu.esal=22000;
sonu.ceo="nilesh";

harry.show();
sonu.show();
	}

}
