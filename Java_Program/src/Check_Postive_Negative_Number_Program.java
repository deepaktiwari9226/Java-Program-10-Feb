import java.util.*;
public class Check_Postive_Negative_Number_Program {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter integer no");
    int n = sc.nextInt();
    if(n>=0) {
    	System.out.println("User enter integer is +ve = "+n);
    }
    else {
    	System.out.println("user enter integer is -ve = "+n);
      }
	}
}
