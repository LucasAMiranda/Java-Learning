package ex01;

public class fibonacci {

	public static void main(String[] args) {
		
		int f1, f2;
		
	    f1=f2=1;
		
	 System.out.println(" 0,1,1");
	 
	 while(f2 <= 4) {
		 System.out.println("," + (f1+f2));
		 
		 if(f1>f2){
			 f2 += f1;
		 }
		 else{
			 
			 f1 += f2;
		 }
		 
	 }

	}

}
