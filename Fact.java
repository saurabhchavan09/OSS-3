public class Fact
{ 
	public static void main(String []args)
	{ 
	int num=4,res=1,i; 	
		boolean temp = false;
		for (i = 1;i <= num; i++)
		{
			res=res*i;
		}
		System.out.println("The Factorial "+num+" is =  " +res);

		//new lines added are
		System.out.println("new lines added are");
		System.out.println("Testing");
		System.out.println("The Factorial "+num+" is =  " +res);
	}
} 