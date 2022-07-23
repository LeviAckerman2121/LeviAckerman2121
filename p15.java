class p15{
public static void main(String args[])
{
int num =Integer.parseInt(args[0]);
{
if(num>=0)
{
	int i=1;
	int fact=1;
	while(i<=num)
	{
		fact*=i;
		i=+1;
	}
	System.out.println("factorial= "+fact);
}
else
{
System.out.println("Invalid output");
}
}
}
}
