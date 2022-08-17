package projectA05;

public class projectA0513 {

	public static void main(String[] args) {
	  int sum=0;
	  int sum1=0;
	  int sum2=0;
	  
	  for(int i=0;i<=100;i++) {
		  if(i%5==0) {
			  sum = sum +i;
		  }
		  if(i%10==0) {
			  sum1 = sum1 +i;
		  }
		  if(i%11==0) {
			  sum2 = sum2 +i;
		  }
	  }
	  System.out.println("5의배수합"+sum);
	  System.out.println("10의배수합"+sum1);
	  System.out.println("11의배수합"+sum2);
		
	  

	}

}
