import java.util.*;
public class Smallest_Using_Three_No {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Three no");
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();
    int small=a;
    if(b<small)
    	small=b;
    if(c<small)
    	small=c;
    System.out.println("Smallest no are = " +small);
	}
}
