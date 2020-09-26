package com.datastructure.linktable;

import java.util.Arrays;

public class ArrayList implements List {
       
	 private Object[] elementData;
	 
	 private int size;
	 
	 public ArrayList(){
		 
		 this(4);
		 
		 //elementData = new Object[]{};
		 
	 }
	 
	 
	 public ArrayList(int initialCapacity) {
		 elementData = new Object[initialCapacity];
		 
		 //size=0;
	 }
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object get(int i) {
		
		if(i<0||i>=size){//i<0||i>size
			//throw new RuntimeException("数组索引越界异常:"+i);
			throw new MyArrayIndexOutOfBoundsException("数组索引越界异常:"+i);
		}
		
		return elementData[i];
	}

	@Override
	public boolean isEmpty() {
		return size ==0;
	}

	@Override
	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(int i, Object e) {
	
		if(i<0||i>size){
			throw new MyArrayIndexOutOfBoundsException("数组索引越界异常:"+i);
		}
		if(size==elementData.length){
            grow();
	}
	for(int j=size;j>i;j--){
		elementData[j]= elementData[j-1];
	}
	  //给数据赋值
	  elementData[i] = e;
	  //元素个数+1
	  size++;
	  //elementData[size++] = e;
	  //System.out.println("length="+elementData.length); 
	}

	@Override
	public void add(Object e) {
		this.add(size, e);
		//if(size==elementData.length){
            //   grow();
	//	}
		
		//给数据赋值
	//	elementData[size] = e;
		//元素个数+1
	//	size++;
		//elementData[size++] = e;
		//System.out.println("length="+elementData.length);
	}

	private void grow(){
		//Object [] newArr = new Object[elementData.length*2];
		//for(int i=0;i<size;i++){
		//	newArr[i] = elementData[i];
		    
		//}
	//	elementData = newArr;
		elementData =Arrays.copyOf(elementData, elementData.length*2);
	}
	
	@Override
	public boolean addBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString(){
		if(size==0){
			return "[ ]";	
		}
		
		StringBuilder builder = new StringBuilder("[");
		for(int i=0;i<size;i++){
			if(i !=size -1){
			builder.append(elementData[i]+",");
		}else{
			builder.append(elementData[i]);
		}
			}
		builder.append("]");
		return builder.toString();
	}
}
	
