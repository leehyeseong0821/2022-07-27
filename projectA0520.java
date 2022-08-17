package projectA05;

public class projectA0520 {

	public static void main(String[] args) {
//		0~100까지 짝수만 출력
		int sum=0;
		int sum1=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				sum = sum+i;
			}else {
				sum1 = sum1+i;
			}
			
		}
		System.out.println("짝수의 값"+sum);
		System.out.println("홀수의 값"+sum1);
		
		for(int i=0;i<=100;i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int j=1;j<=100;j=j+2) {
			System.out.print(j+" ");
		}
	
		

	}

}
