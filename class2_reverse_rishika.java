package class2;

public class class2_reverse_rishika {
	public static void main(String[] args) {
		int a,b=0,c;
		
		int n=5576;
		c=n;
		while(n>0) {
			a=n%10;
			b=(b*10)+a;
			n=n/10;
			
		}
			System.out.println("reverse number is"+b);
			
		
		
		}
		
	}


