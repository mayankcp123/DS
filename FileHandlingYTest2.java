import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileHandlingYTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MyFileReader
{
	FileInputStream fin;
	MyFileReader(String fileName){
		System.out.println("------------Trying to open the file..-----------");
		try {
			fin = new FileInputStream(fileName);
		}
		catch(FileNotFoundException e) {
			System.out.println("Problem1 : "+e);
		}
		System.out.println("File is Open..");
	
	}
	void readFileData() throws InterruptedException, IOException {
		try {
			byte b = (byte) fin .read(); 
			while(b!= -1) {
			System.out.print((char)b);
			b=(byte) fin.read();
			Thread.sleep(10);
			}
		}
			catch(FileNotFoundException e) {
				System.out.println("Problem1 "+e);
			} 
		}
	}

