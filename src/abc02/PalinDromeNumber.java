package abc02;

public class PalinDromeNumber 
{
	public static void main(String[] args) 
	{int a=141;
	int n=a;
	int rev =0,rem=0;
	while(a!=0)
	{
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		
	}if(n==rev) {
		System.out.println(n+" is a pallindrome number");
		
	}else
	{
		System.out.println(n+" is not a pallindrome number");
	}
		
	}

}
