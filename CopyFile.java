import java.io.*;
import java.io.IOException;

class CopyFile{
	public static void main(String[] args) throws IOException{
		FileInputStream r = new FileInputStream("C:\\Users\\sounak.DESKTOP-TUAUH7K\\Desktop\\data\\readingFile.txt");
		FileOutputStream w = new FileOutputStream("C:\\Users\\sounak.DESKTOP-TUAUH7K\\Desktop\\data\\writingFile.txt");
		
		int i;
		while((i=r.read()) != -1){
			w.write((char)i);
		}
		System.out.print("\n Data Copied Successfully from source to destination file");
	}
}

