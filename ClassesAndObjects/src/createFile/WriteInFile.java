package createFile;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteInFile {

	public static void main(String[] args) {
		try {
			File file = new File("filename.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			pw.println("this is my file content");
			pw.println(10000);
			pw.close();
			System.out.println("DONE");
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
