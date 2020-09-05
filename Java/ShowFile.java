package multithreading;

import java.io.*;

class ShowFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;

		//First check if filename is input or not
		if(args.length != 1) {
			System.out.println("Provide the filename only.");
			return;
		}

		try {
			fin = new FileInputStream(args[0]);
		} catch(FileNotFoundException exc) {
			System.out.println("Cannot open file with filename: " + args[0]);
			return;
		}

		try {
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("Error in reading file.");
		}

		try {
			fin.close();
		} catch(IOException exc) {
			System.out.println("Error closing file.");
		}
	}
}