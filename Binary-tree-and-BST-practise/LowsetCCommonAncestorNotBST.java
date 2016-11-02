package BinarySearchTree;

public class LowsetCCommonAncestorNotBST {

	public boolean present(Node root,int num){
		if(root==null){
			return false;
		}
		if(root.data==num){
			return true;
		}
		return present(root.left,num)||present(root.right,num);
	}

	public Node lowest(Node root,int left,int right){
		if(root==null){
			return null;
		}
		if(present(root.left,left)&&present(root.left,right)){
			root=lowest(root.left,left,right);
		}
		if(present(root.right,left)&&present(root.right,right)){
			root=lowest(root.right, left, right);
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert ins=new Insert();
		LowsetCCommonAncestorNotBST obj=new LowsetCCommonAncestorNotBST();
		Node ancestor=obj.lowest(ins.getSampleRoot(), 45,200);
		System.out.println(ancestor.data);
	}

}
