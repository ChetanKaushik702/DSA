import java.io.*;

//A file-copy program
class FileCopy {
	static public void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		int i;

		//First, make sure that two filenames have been provided using command-line arguments
		if(args.length != 2) {
			pw.print("Provide proper arguments.");
			return;
		}

		try (var fin = new FileInputStream(args[0]); var fout = new FileOutputStream(args[1])) {
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			pw.println("I/O exception: " + e);
		}
	}
}