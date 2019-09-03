package Programmes;

public class letterDemo {

	public static void main(String[] args)
	{
		String str="harry ";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			while(i<ch.length && ch[i]!=' '  )
			{
			    i++;
			}
			if(i>0)
				System.out.println(str +" having "+ i +" letters");
		}
		
	}

}
