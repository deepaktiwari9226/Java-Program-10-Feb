import java.util.*;
public class Biggest_N0_Three {
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no");
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();
  /*  int big = a;
    if(b>big)
    	big=b;
    if(c>big)
    	big=c;
    System.out.println("Biggest no are = "+big);  */
    if(a>b&&a>c) {
    	System.out.println(a+"is biggest no ");
    }
    else if(b>c) {
    	System.out.println(b+" is biggest no ");
    }
    else {
    	System.out.println(c+"is biggest no");
     }
	}
}
