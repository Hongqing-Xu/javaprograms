package com.datastructure.linktable;

public class TextArrayList {

	public static void main(String[] args) {
		java.util.ArrayList al;
           List list = new ArrayList();
           list.add(123);
           list.add(321);
           list.add(456);
           list.add(678);
           list.add(789);
           list.add(111);
           list.add(222);
           
          list.add(4,666);
           
           System.out.println(list.size());
           System.out.println(list.isEmpty());
           System.out.println(list.get(3));
           System.out.println(list.toString());
	}

}
