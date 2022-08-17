package projectA05;

public class projectA0504 {

	public static void main(String[] args) {
	for(int i=0;i<10;i++) {
		System.out.print(i+"");
	}
	System.out.println();
       
	int j;
	for(j=0;j<10;j++) {
		System.out.print(j+"");
	}
	System.out.println();
	System.out.println(0+1+2+3+4+5+6+7+8+9+10);
	int sum=0;
	for(int i=0;i<=10;i++) {
		sum = sum+i;
	}
	System.out.println(sum);
	int sum1=0;
	for(int k=0;k<=100;k++) {
		sum1 = sum1+k;
	}
	System.out.println(sum1);
	
	sum=0;
	for(int i=0;i<=100;i++) {
		if(i==100) {
			System.out.print(i+"=");
		}else {
			System.out.print(i+"+");
		}
	}
	System.out.print(sum);
	System.out.println();
	
	
	
	}

}
