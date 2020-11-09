import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileSize {
	/*
	 * Directory
	 * |
	 * | file1 file2 file3 dir1
	 * 						|
	 * 						file4 file5 dir2
	 * 									  |
	 * 									  |
	 * 									  file6
	 */
	
	public static long getSize(File file) {
		long size = 0;
		// if file => get size
		// if directory => get all of the files, and
		// process all of the files and dir 
		if(file.isDirectory()) {
			File [] files = file.listFiles();
			//for every of these files
			List<File> xFiles = new LinkedList<>(Arrays.asList(files));
			for (File f: xFiles) {
				size += getSize(f);
			}
		}
		
		else{
			size += file.length();
		}
		
		return size;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please give me a directory");
		String str = input.nextLine();
		System.out.println("The size is: " + getSize(new File(str)));
	}

}
