package mypack;
public class RightTriangle 
{
	public static boolean checkTri(int a,int b,int c)
	{
		boolean f=false;
		if(a>b&&a>c)
		{
			if((a*a)==(b*b)+(c*c))
				f = true;
		}
	
		if(b>c&&b>a)
		{
			if((b*b)==(c*c)+(a*a))
				f = true;
		}
		if(c>a&&c>b)
		{
		if((c*c)==(a*a)+(b*b))
			f = true;
		}
		return f;
	}
}
