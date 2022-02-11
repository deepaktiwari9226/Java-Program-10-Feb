import java.util.*;
public class Month {
	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter month no ");
    int m = sc.nextInt();
   /* if(m<0||m>12) {
    	System.out.println("Invalid month no ");
    }
    else {
    	System.out.println("Valid month no ");
    } */
    
    if(m>=1&&m<=12) {
    	System.out.println("Valid month no");
    }
    else {
    	System.out.println("Invalid month no");
      }
	}
}
