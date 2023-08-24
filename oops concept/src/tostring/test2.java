package tostring;
import java.util.*;
public class test2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	String s1=sc.next();
	System.out.println("enter mobno");
	long l=sc.nextLong();
	System.out.println("enter location");
	String s2=sc.next();
	Hospital h = new Hospital(s1,l,s2);
	System.out.println(h);
}
}
