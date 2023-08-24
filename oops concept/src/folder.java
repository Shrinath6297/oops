import java.io.*;
import java.util.*;
public class folder {
public static void main(String[] args) throws IOException {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter folder name");
	 String folder =sc.next();

	File f=new File("F:\\"+folder);
	boolean b =f.mkdir();
			if (b==true)
	{
		System.out.println("folder is create");
		
		
	}
	else
	{
		System.out.println("folder not create");
		
	}
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter file.pdf");
			String file=sc.next();
	File f1=new File(f+"\\"+file);
	
	boolean b1 =f1.createNewFile();
	
	if (b1==true)
	{
		System.out.println("file is create");
		
		
	}
	else
	{
		System.out.println("file not create");
		
	}
	
	Scanner sc2 =new Scanner(System.in);
	System.out.println("enter information"+f1);
	String information=sc.next();
	FileWriter fw=new FileWriter(f1,true);
	
	
	
	fw.write(information);
	fw.flush();
	
	
}

	
}

