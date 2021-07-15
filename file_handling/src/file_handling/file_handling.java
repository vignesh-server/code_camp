package file_handling;
import java.util.*;
import java.io.FileOutputStream;

public class file_handling {

	public static void main(String[] args) {
		try {
			Scanner  s1 =new Scanner(System.in);
			 String name,s;
			 System.out.println("enter  your name");
			 	 name=s1.nextLine();
			 	 System.out.println("enter the storage  data");
			 	 FileOutputStream fn =new  FileOutputStream("file.txt");
		}
	 catch(Exception e)
		{
		 System.out.println("data not saved...");
		}
	}

}
