 package com.datastructure.linetable;

import java.util.LinkedList;
import java.util.ArrayList;
public class tran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList<String> myarrlist = new ArrayList<String>();
           myarrlist.add("A");
           myarrlist.add("B");
           myarrlist.add("C");
           myarrlist.add("D");
           System.out.println("ArrayList:"+myarrlist);
           System.out.println("ArrayList:"+myarrlist.size());
           System.out.println("ArrayList.LinkedList");
           System.out.println("ArrayList:"+myarrlist.indexOf("B"));
           System.out.println("ArrayList:"+myarrlist.get(1));
		   LinkedList<String> mylinklist=new LinkedList<String>(myarrlist);
		   System.out.println("LinkedList:"+mylinklist);
		   System.out.println("清空linkedlist并添加1,2,3");
		   mylinklist.clear();
		   mylinklist.add("1");
		   mylinklist.add("2");
		   mylinklist.add("3");
		   System.out.println("LinkedList:"+mylinklist);
		   System.out.println("mylinklist:"+mylinklist.size());
		   myarrlist=new ArrayList<String>(mylinklist);
		   System.out.println("LinkedList->Arraylist");
		   System.out.println("ArrayList:"+myarrlist);
		   System.out.println("ArrayList:"+myarrlist.indexOf("2")); 
		   System.out.println("ArrayList:"+myarrlist.get(1));
	}

}
