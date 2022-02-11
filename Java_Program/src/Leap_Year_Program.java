import java.util.*;
public class Leap_Year_Program {
	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter any year");
    int y = sc.nextInt();
   if(y%4==0&&y/100!=0||y/400==0) {
    	System.out.println("Leap year");
    }
    else {
    	System.out.println("Not a leap year");
     }  
	}
}
