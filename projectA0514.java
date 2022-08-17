package projectA05;

public class projectA0514 {

	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=1000;i++) {
			if(i%7==0) {
				sum = sum+i;
			}
			if(i%8==0) {
				sum1 = sum1+i;
			}
			if(i%9==0) {
				sum2 = sum2+i;
			}
		}
		System.out.println("7의 배수합:"+sum);
		System.out.println("8의 배수합:"+sum1);
		System.out.println("9의 배수합:"+sum2);

	}

}
