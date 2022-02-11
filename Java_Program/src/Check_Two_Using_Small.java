import java.util.*;
public class Check_Two_Using_Small {
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter any two ");
   int a = sc.nextInt();
   int b = sc.nextInt();
   int small;
   if(a<b) {
	   small= a;
	   System.out.println("Smallest no are = "+small);
   }
   else {
	   small = b;
	   System.out.println("Smallest no are = "+small);
   }
	}
}
