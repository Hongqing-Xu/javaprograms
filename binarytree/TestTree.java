package binarytree;
   public class TestTree {
	   public static void main(String[] args) {
           FindTree ft = new FindTree();
           int[] array = {12,76,35,22,16,48,90,46,9,40,90};
          
         Node root = new Node(array[0]);
          for(int i = 1; i < array.length; i++){
              insert(root, array[i]);
          }
          System.out.println("preorder:");  
          ft.preOrder(root);  
         System.out.println("\n"+"inorder:");  
         ft.inOrder(root);  
          System.out.println("\n"+"afterorder:");  
          ft.afterOrder(root);  
          System.out.println("\n"+"levelOrder:");  
          ft.levelOrder(root); 
   }
	   private static void insert(Node root, int data) {
	          if(root.getData() < data){
	             if(root.getRightChild() == null){
	                 root.setRightChild(new Node(data));
	             }else{
	                  insert(root.getRightChild(), data);
	              }
	          }else {
	             if(root.getData() > data){
	                  if(root.getLeftChild() == null){
	                      root.setLeftChild(new Node(data));
	                  }else{
	                      insert(root.getLeftChild(), data);
	                  }
	              }
	          }
	      }
   }

