package class2;

public class class2_palindrome_rishika {
	
	public static void main(String[] args) {
		int a,b=0,c;
		
		int n=12321;
		c=n;
		while(n>0) {
			a=n%10;
			b=(b*10)+a;
			n=n/10;
		}
		if(c==b)
			System.out.print("palindrome number");
		else
			System.out.print("not palindrome");
		}
		
	}


