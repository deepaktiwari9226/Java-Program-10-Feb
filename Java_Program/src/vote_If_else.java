import java.util.*;
public class vote_If_else {
	public static void main(String[] args) {
		int age;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your age");
     age = sc.nextInt();
     if(age>=18) {
    	 System.out.println("You can vote");
     }
     else {
    	System.out.println("You can not vote"); 
      }
	}
}
