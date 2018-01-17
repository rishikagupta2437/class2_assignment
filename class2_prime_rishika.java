package class2;

public class class2_prime_rishika {
	
	public static void main (String[] args) {
		int r,t=1,c=0,n=17;
		while(t<=n) {
			r=n%t;
			t++;
			if(r==0)
			{
				c++;
				
			}
		}
		if(c==2)
	
			System.out.print("number is  prime");
			else
				System.out.print("number is  not prime");
		}
	}




