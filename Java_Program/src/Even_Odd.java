import java.util.*;
public class Even_Odd 
{
	public static void main(String[] args) 
	{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any no");
    int n = sc.nextInt();
    if(n%2==0) {
    	System.out.println("even is = " +n);
    }
    else {
    	System.out.println("odd is = " +n);
      }
	}
}
