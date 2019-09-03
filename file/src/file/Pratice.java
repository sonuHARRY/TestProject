package file;
		public class Pratice {
			int a=0;
			int b=0;
			double c=0;
			Pratice(){
				 a=10;
				 b=20;
			  c=20.5;
			}
			
			Pratice(int x,int y){
				 a=x;
			 b=y;
			}
			
			Pratice(int x,double y){
				 a=x;
				 c=y;
			}
			
			Pratice(int x,int y,double z){
				 a=x;
				 b=y;
				 c=z;
			}
			
			void display() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);		
			}
	public static void main(String[] args) {
		Pratice obj=new Pratice(10,90,20.9);
		obj.display();
		
	}	
	}

	

	
		
	
	

