package projectA05;

public class projectA0521 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				sum = sum +i;
			}
		}
		System.out.println( sum);
          
		 
		int sum1= 0;
		for (int i=0;i<=100;i++) {
			if(i%2==0) {
				sum1 = sum1 +i;
			}
		}
		System.out.println(sum1);
	}

}
