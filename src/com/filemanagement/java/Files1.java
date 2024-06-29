package com.filemanagement.java;

import java.io.File;
import java.io.IOException;

public class Files1 {

	public static void main(String[] args) throws IOException {
          File f = new File("D:\\AkhilResume.txt");
        System.out.println(f.exists());
         if(f.exists()) {
        f.delete();
         }
          
         else {
        	 f.createNewFile();
         }
          
          System.out.println(f.exists());
          System.out.println(f.isHidden());
          f.setReadOnly();
	}

}
