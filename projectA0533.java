package projectA05;

public class projectA0533 {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=1;i<=9;i++) {
			if(i<=5) {
				count++;
			}else {
				count--;
			}
			for(int j=1;j<=5-count;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*count;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		  
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=5-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		
		
		}
			
}
