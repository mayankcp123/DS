
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileCharacterBasedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Trying to open a file.");

			FileReader fout = new FileReader("C:/Users/MSR35/Desktop/not.txt");
			System.out.println("File is created.");

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your data");
			String str = scan.nextLine();

			// String str1 = "This is the Data";
			System.out.println("Got the string data.");

			byte byteArray[] = str.getBytes();
			System.out.println("Converted the string Array to byte array.");

			fout.read();
			System.out.println("byte array is written to the file..");
 
			fout.close();
			System.out.println("File is closed..");
		}

		catch (IOException e) {

			System.out.println("Problem1 " + e);
		}
	}
}
