package BinarySearchTree;

public class SmallestDiffNode {
	private Node root;
	SmallestDiffNode(int data){
		root=new Node(data);
	}

	public Node minNode(Node root,Node left,Node right,int num){
		Node smallest=root;
		int diff=Math.abs(root.data-num);
		if(left!=null&&Math.abs(left.data-num)<diff){
			smallest=left;
			diff=Math.abs(left.data-num);
			
		}
		if(right!=null&&Math.abs(right.data-num)<diff){
			smallest=right;
			diff=Math.abs(right.data-num);
		
		}
		return smallest;
	}
	public Node minDiffNode(Node root,int num){
		Node smallestNode;
		if(root==null){
			return null;
		}else{
			smallestNode=minNode(root,minDiffNode(root.left,num),minDiffNode(root.right,num),num);
		}
		return smallestNode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmallestDiffNode sdt=new SmallestDiffNode(40);
		Insert ins=new Insert();
		sdt.root=ins.getSampleRoot();
		Node small=sdt.minDiffNode(sdt.root,6);
		System.out.println(small.data);
		
	}

}
