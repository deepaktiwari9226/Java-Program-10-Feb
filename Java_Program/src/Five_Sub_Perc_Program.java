import java.util.*;
 public class Five_Sub_Perc_Program 
{
 public static void main(String[] args)
	{
	int h,e,m,p,c,total;
	double per;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Hindi marks");
    h=sc.nextInt();
    System.out.println("Enter English marks");
    e=sc.nextInt();
    System.out.println("Enter Math marks");
    m=sc.nextInt();
    System.out.println("Enter Physics");
    p=sc.nextInt();
    System.out.println("Enter Chemistry");
    c=sc.nextInt();
    total=h+e+m+p+c;
    per = (total/500.0)*100;
    System.out.println("-----*-----");
   if(h<35||e<35||m<35||p<35||c<35) { 
	System.out.println("fail");
   }
   else {
	System.out.println("Pass");
   }
   System.out.println("Total marks = "+total);
   System.out.println("percentage = "+per);
	}
  }
