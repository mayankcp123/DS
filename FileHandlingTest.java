import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest {

	public static void main(String[] args) {
		
		try {
			System.out.println("------------Trying to open the file..-----------");
			FileInputStream fin = new FileInputStream("C:/Users/MSR35/Desktop/notes.txt");
			System.out.println("File is Open...");
			
			FileInputStream fun = new FileInputStream("C:\\Users\\MSR35\\eclipse-workspace\\BankingProject/src/DataTypeTest.java");
			
			FileInputStream foo = new FileInputStream("C:/Users/MSR35/Desktop/notes.txt");
			byte b = (byte) fin .read(); 
			while(b!= -1) {
			System.out.print((char)b);
			b=(byte) fin.read();
			Thread.sleep(10);
			}
			System.out.println("------------Trying to open the second file..---------");
			System.out.println("File is Open...");
			byte c = (byte) fun .read(); 
			while(c!= -1) {
			System.out.print((char)c);
			c=(byte) fun.read();
			Thread.sleep(10);
			}
			System.out.println("---------Trying to open the Third file..-----------");
			System.out.println("File is Open...");
			byte d = (byte) foo .read(); 
			while(d!= -1) {
			System.out.print((char)d);
			d=(byte) foo.read();
			Thread.sleep(10);
			}
		System.out.println("Trying to close the file..");
		fin.close();
		System.out.println("File is closed...");
		}
			
		catch(FileNotFoundException e) {
			System.out.println("Problem1 "+e);
		} 
		catch (IOException e) {
			System.out.println("Problem2 "+e);
		} 
		catch (InterruptedException e) {
			System.out.println("Problem3 "+e);
		}

	}


	}
