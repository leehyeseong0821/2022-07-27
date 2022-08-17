package projectA05;

public class projectA0522 {

	public static void main(String[] args) {
		  
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
        
		for(int i=1;i<=3;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print("*");
		}
		  System.out.println();
		  }
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
		}
			
		System.out.println();
			}
//			끝에서 감소
			for(int b=1;b<=5;b++) {
				for(int j=1;j<=5-b;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=b;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		
	}

}
