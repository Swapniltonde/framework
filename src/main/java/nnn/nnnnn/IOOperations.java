package nnn.nnnnn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOOperations {
	
	public void writeData() {
		String path = "E:\\WS_Inportia\\nnnnn\\nnnnn.txt";
		File file = new File(path);//This virtually creates a file ...not physically
		System.out.println(file);
		try {
			FileOutputStream os = new FileOutputStream(file);//this physically creates a file at location
			os.write(33);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InputStream is;
		//OutputStream os;
		//Reader re;
		//Writer wi;
		
	}
	
	public void ReadData() {
		String path = "E:\\WS_Inportia\\nnnnn\\nnnnn.txt";
		File file = new File(path);
		System.out.println(file);
		
		try {
			Reader rr  = new FileReader(file);//Filereader helps to read the pile which is physically present
			int leter  =rr.read();
			System.out.println((char)leter);
			rr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}
