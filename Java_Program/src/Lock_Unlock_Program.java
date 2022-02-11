import java.util.*;
public class Lock_Unlock_Program {
	public static void main(String[] args) {
		long ps;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your password");
     ps = sc.nextLong();
     if(ps==12345) {
    	System.out.println(" Unlock your phone "); 
     }
     else {
    	System.out.println("Lock "); 
      }
	}
}