package Package1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "This is my text pad and my name is Palaash Rahul Deodhar.";
		FileOutputStream file1;
		try {
			
			file1 = new FileOutputStream("Result.txt",true);
			file1.write(str1.getBytes());
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
