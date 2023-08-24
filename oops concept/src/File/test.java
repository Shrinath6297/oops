package File;
import java.io.*;

public class test {
public static void main(String[] args)throws Exception {
	File f=new File ("C:\\Users\\Shri\\Desktop\\Shri\\ab.txt");
	//File f2=new File ("C:\\Users\\Shri\\Desktop\\Shri\\ac.jpg");
//	File f3=new File ("C:\\Users\\Shri\\Desktop\\Shri\\ac.doc");
//	File f4=new File ("C:\\Users\\Shri\\Desktop\\Shri\\ac.xlsx");
	boolean b =f.createNewFile();
	
	if (b==true)
	{
		
		System.out.println("file creted succesfully");
		
	}
	else {
		
		System.out.println("file is not created"+f.getName());
		
	}
	File f1=new File ("C:\\Users\\Shri\\Desktop\\Shri\\asdfg.pdf");

	boolean b1 =f1.createNewFile();
	if (b1==true)
	{
		
		System.out.println("file creted succesfully");
		
	}
	else {
		
		System.out.println("file is not created"+f.getName());
		
	}
	
	File f4=new File ("C:\\Users\\Shri\\Desktop\\Shri\\ac.xlsx");
	boolean b4 =f4.createNewFile();
	if (b4==true)
	{
		System.out.println("file create");
		
	}
	
	else {
		System.out.println("not create");
	}
}
}
