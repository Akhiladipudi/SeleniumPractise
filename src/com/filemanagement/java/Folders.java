package com.filemanagement.java;

import java.io.File;

public class Folders {

	public static void main(String[] args) {
           File f1 = new File("./Resources/");
         System.out.println(  f1.mkdir());
         f1.delete();
         System.out.println(f1.delete());
	}

}
