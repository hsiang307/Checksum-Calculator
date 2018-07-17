import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ChecksumCalculator {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Sample.txt");
		FileReader fr = new FileReader(file); 
		char [] a = new char[(int) file.length()];
		fr.read(a);
		
		long checksum = 0;
		
		for (int i=0; i<file.length(); i++)
		{
			char character = a[i]; 
			int ascii = (int) character; 
			checksum=checksum+ascii;
		}
		
		System.out.println(checksum);
	
	}
}