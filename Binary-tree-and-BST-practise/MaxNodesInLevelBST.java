package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxNodesInLevelBST {
	
	public int maxNodeInLevel(Node root){
		int maxCount=0,level=-1,count=0;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		Node current;
		while(!q.isEmpty()&&q.size()>1){
			current=q.poll();
			if(current==null){
				q.add(null);
				if(count>maxCount){
					maxCount=count;
					level++;
				}
				count=0;
				continue;
			}
			if(current.left!=null){
				q.add(current.left);
			}
			if(current.right!=null){
				q.add(current.right);
			}
			count++;
		}
		count++;
		if(count>maxCount){
			maxCount=count;
			level++;
		}
		return level;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert ins=new Insert();
		Node root=ins.getSampleRoot();
		MaxNodesInLevelBST obj=new MaxNodesInLevelBST();
		System.out.println(obj.maxNodeInLevel(root));
	}

}
