package com.collection.java;

import java.util.ArrayList;

public class ArrayPractse {

	public static void main(String[] args) {
       ArrayList<Integer> al = new ArrayList<>();
       al.add(25);
       al.add(35);
       al.add(56);
       
       ArrayList<String> al1 = new ArrayList<>();
       al1.add("Akhil");
       al1.add("Sravathi");
       al1.add("maha");
       
       ArrayList<Integer> al2 = new ArrayList<>();
       al2.add(22);
       al2.add(33);
       al2.add(89);
       
       al2.addAll(0,al);
       System.out.println(al2);
       
       
       
       
    //   al1.addall(al);
       }

}
