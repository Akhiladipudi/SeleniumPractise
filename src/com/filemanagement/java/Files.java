package com.filemanagement.java;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {
        File file = new File("D:\\Akhil.txt");
        file.delete();
       System.out.println( file.createNewFile());
	}

}
