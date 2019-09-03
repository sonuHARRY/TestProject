package file;

public class Largest_two_number {

	public static void main(String[] args) {
		int a[]={101,200,1500,69,49,34,56,21,100,5};
		int fbig=a[0];
        int sbig=a[0];
        for(int i=0;i<a.length;i++){
        	if(fbig<a[i]){
        		//sbig=fbig;
        		fbig=a[i];
        		}
        	for(int j=0;j<a.length;j++){
        	if(sbig>a[j]){
        		sbig=a[j];
        	}
        	}
        }System.out.println(fbig);
        System.out.println(sbig);
	}

}
