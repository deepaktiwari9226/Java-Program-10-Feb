import java.util.*;
public class Double_Biggest_Value_Using_Two_No {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any two no");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double big;
    if(a>b) {
    	big = a;
    	System.out.println("\n bigest no are = "+big);
    }
    else {
    	big = b;
    	System.out.println("\n bigest no are = "+big);
    }
	}
}
