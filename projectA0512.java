package projectA05;

public class projectA0512 {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<=100;i++) {
			if(i%3==0) {
				sum1 = sum1+i;
			}if(i%4==0) {
				sum2 = sum2+i;
			}
		}
          System.out.println("3의 배수 합:"+sum1);
          System.out.println("4의 배수 합:"+sum2);
	}

}
