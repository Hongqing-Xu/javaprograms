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
      //先序遍历
      public void preOrder(Node root){
          if(root == null) return ;
          
          visit(root.getData());
          preOrder(root.getLeftChild());
          preOrder(root.getRightChild());
      }
      //中序遍历
      public void inOrder(Node root){
          if(root == null) return ;
          
          inOrder(root.getLeftChild());
          visit(root.getData());
          inOrder(root.getRightChild());
      }
      //后序遍历
      public void afterOrder(Node root){
          if(root == null) return ;
          
          afterOrder(root.getLeftChild());
         afterOrder(root.getRightChild());
          visit(root.getData());
      }
      

      public void levelOrder(Node root){
         
          List<Node> queue = new ArrayList<Node>();
          if(root != null){
             queue.add(root);//将根结点入队
              while(queue.size() != 0){//当队列不空的时候进行循环
                  Node q = queue.remove(0);//出队列       返回从列表中移除的元素
                 visit(q.getData());//访问该结点
                  
                  if(q.getLeftChild() != null){//如果它有左子树，则将左子树根节点入队; 
                      queue.add(q.getLeftChild());
                 }
                  if(q.getRightChild() != null){//如果它有右子树，则将右子树根节点入队;
                      queue.add(q.getRightChild());
                  }
              }
          }    
      }
    
      
  }
 

  


		  