package BinarySearchTree;

public class Insert2 {
	private Node root;
	Insert2(){
		insert(50);
		insert(45);
		insert(55);
	}

	public void insert(int data){
		Node newNode=new Node(data);
		Node current=root;
		Node parent=null;;
		while(current!=null){
			//System.out.println("Inserting");
			parent=current;
			
			if(data<current.data){
				//System.out.println("hi");
				current=current.left;
				if(current==null){		
					parent.left=newNode;
					//System.out.println("inserting to left node of "+parent.data);
				}
			}
			else{
				//System.out.println(current.data);
				current=current.right;
				if(current==null){
					parent.right=newNode;
					//System.out.println("inserting to right node of "+parent.data);
				}
			}
		}
		if(root==null){
			//System.out.println("creating root node");
			root=newNode;
		}
	}
	public Node getSampleRoot(){
		return root;
	}

}
