import mypack.RightTriangle;
import java.util.*;
public class RTriangle {

	public static void main(String argd[]) {
						int s1,s2,s3;
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter the 3 sides of the triangle\n");
						s1=sc.nextInt();
						s2=sc.nextInt();
						s3=sc.nextInt();
						if(RightTriangle.checkTri(s1,s2,s3))
							System.out.println("It is a right-angled triangle");
						else
							System.out.println("It is not a right-angled triangle");
			}

}
