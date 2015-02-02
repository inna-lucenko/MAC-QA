package selenium;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileWr {

	//final static String fileName = "report_java.txt";
	PrintWriter writer;

	public void writeToFile(String fileName, String dirName) throws FileNotFoundException,
			UnsupportedEncodingException {
		//File dir = new File("report");
		File dir = new File(dirName);
		dir.mkdir();
		File file = new File(dir, fileName);
		file.toString();
		writer = new PrintWriter(file, "UTF-8");

	}

	public void writeFile(String text) {
		writer.println(text);
	}

	public void closeWrite() throws IOException {
		writer.close();
	}

	
}
