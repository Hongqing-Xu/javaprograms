package binarytree;

import java.util.ArrayList;
import java.util.List;
  class Node {
       private int data;
       private Node leftChild;
       private Node rightChild;
       
      public Node(){
          
      }
  
      public Node(int data) {
          super();
          this.data = data;
      }
  
      public int getData() {
          return data;
      }
  
      public void setData(int data) {
          this.data = data;
      }
  
      public Node getLeftChild() {
          return leftChild;
      }
  
      public void setLeftChild(Node leftChild) {
          this.leftChild = leftChild;
      }
  
      public Node getRightChild() {
          return rightChild;
      }
  
      public void setRightChild(Node rightChild) {
          this.rightChild = rightChild;
      }
      
  }



    class FindTree {
  
     private void visit(int data){
          System.out.print(data + "  ");
      }
      //�������
      public void preOrder(Node root){
          if(root == null) return ;
          
          visit(root.getData());
          preOrder(root.getLeftChild());
          preOrder(root.getRightChild());
      }
      //�������
      public void inOrder(Node root){
          if(root == null) return ;
          
          inOrder(root.getLeftChild());
          visit(root.getData());
          inOrder(root.getRightChild());
      }
      //�������
      public void afterOrder(Node root){
          if(root == null) return ;
          
          afterOrder(root.getLeftChild());
         afterOrder(root.getRightChild());
          visit(root.getData());
      }
      

      public void levelOrder(Node root){
         
          List<Node> queue = new ArrayList<Node>();
          if(root != null){
             queue.add(root);//����������
              while(queue.size() != 0){//�����в��յ�ʱ�����ѭ��
                  Node q = queue.remove(0);//������       ���ش��б����Ƴ���Ԫ��
                 visit(q.getData());//���ʸý��
                  
                  if(q.getLeftChild() != null){//��������������������������ڵ����; 
                      queue.add(q.getLeftChild());
                 }
                  if(q.getRightChild() != null){//��������������������������ڵ����;
                      queue.add(q.getRightChild());
                  }
              }
          }    
      }
    
      
  }
 

  


		  