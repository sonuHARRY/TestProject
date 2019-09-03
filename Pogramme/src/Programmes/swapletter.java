package Programmes;

public class swapletter {

	public static void main(String[] args) {
		String str="jspider and qspider";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		int k=i;
		while(i<ch.length && ch[i]!=' ')
		{
			i++;
		}
		char t=ch[i-1];	
		ch[i-1]=ch[k];
		ch[k]=t;
		
		}
System.out.println(ch);
	}

}
