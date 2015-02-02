package selenium.pages;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class FileWr extends  AnyPage{

	public FileWr(selenium.pages.PageManager pages) {
		super(pages);
		}
		PrintWriter writer;
		private OutputStreamWriter write;

	public void writeToFile(String fileName, String dirName) throws Exception {
	
//		Writer writer = new FileWriter("/users/Jomedia/Documents/YRAAAAAA.txt");

/*		boolean moreData = false;
		while(moreData) {
		  String data = getMoreData();
		  write = null;
		write.write(data);*/
		}
		//writer.close();	
		
		
/*		
		//	File dir = new File("report1111.txt");
		FileWriter fw = new FileWriter("out.txt");
		File dir = new File(dirName);
		dir.mkdir();
		File file = new File(dir, fileName);
		file.toString();
	//	writer = new PrintWriter(file, "UTF-8");
		fw.close();*/
	

	private String getMoreData() {
		// TODO Auto-generated method stub
		return null;
	}

	public void writeFile(String text) {
		writer.println(text);
	}

	public void closeWrite() throws IOException {
		writer.close();
	}

	
}
