package binarytree;

import java.util.LinkedList;

public class BTreeSearch {

	// 创建一个二叉树
		public TreeNode getTargetTree() {
			// 叶子节点
			TreeNode G = new TreeNode("G");
			TreeNode D = new TreeNode("D",null,G);
			TreeNode E = new TreeNode("E");
			TreeNode B = new TreeNode("B", D, null);
		//	TreeNode H = new TreeNode("H");
		//	TreeNode I = new TreeNode("I");;
			TreeNode F = new TreeNode("F");
			TreeNode C = new TreeNode("C", E, F);
			// 构造根节点
			TreeNode root = new TreeNode("A", B, C);
			return root;
		}
	    

		/**
		 * 前序遍历
		 */
		public void preorderVistTreeNode(TreeNode node) {
			if (null != node) {
	            
				System.out.print(node.value);
	            
				if (null != node.leftchildren) {
					preorderVistTreeNode(node.leftchildren);
				}
				if (null != node.rightchildre) {
					preorderVistTreeNode(node.rightchildre);
				}
			}
		}

		public void inorderVistTreeNode(TreeNode node){
	        if(null != node){
	            if(null != node.leftchildren){
	                inorderVistTreeNode(node.leftchildren);
	            }
	            
	            System.out.print(node.value);
	            
	            if(null != node.rightchildre){
	                inorderVistTreeNode(node.rightchildre);
	            }
	        }
	    }

		 public void postorderVistTreeNode(TreeNode node){
		        if(null != node){
		            if(null != node.leftchildren){
		                postorderVistTreeNode(node.leftchildren);
		            }
		            if(null != node.rightchildre){
		                postorderVistTreeNode(node.rightchildre);
		            }
		            
		            System.out.print(node.value);
		            
		        }
		 }       
		        
			public void levelorderVistTreeNode(TreeNode node) {
				if (null != node) {
					LinkedList<TreeNode> list = new LinkedList<TreeNode>();
					list.add(node);
					TreeNode currentNode;
					while (!list.isEmpty()) {
						
						currentNode = list.poll();
						
						System.out.print(currentNode.value);
						
						if (null != currentNode.leftchildren) {
							list.add(currentNode.leftchildren);
						}
						if (null != currentNode.rightchildre) {
							list.add(currentNode.rightchildre);
						}
					}
				}
			}

	        
		public static void main(String[] args) {
			
			BTreeSearch treeSearch = new BTreeSearch();
			TreeNode tree = treeSearch.getTargetTree();

			System.out.print("前序遍历:");
			treeSearch.preorderVistTreeNode(tree);
			System.out.println("");		
			System.out.print("中序遍历:");
			treeSearch.inorderVistTreeNode(tree);
			System.out.println("");	
			System.out.print("后序遍历:");
			treeSearch.postorderVistTreeNode(tree);
			System.out.println("");	
			System.out.print("层次遍历:");
			treeSearch.levelorderVistTreeNode(tree);
			System.out.println("");		

			
		}

}
