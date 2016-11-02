package BinarySearchTree;
import java.util.*;
public class RootToLeafPath {
	
	public static void path(Node root,ArrayList<String> pathList,String builder){
		if(root.left==null && root.right==null){
			pathList.add(builder+root.data);
		}else{
			String s= root.data+"->";
			if(root.left!=null){
				path(root.left, pathList,builder+s);
			}
			if(root.right!=null){
				path(root.right, pathList, builder+s );
			}	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert obj=new Insert();
		Node root=obj.getSampleRoot();
		ArrayList<String> pathList=new ArrayList<>();
		path(root, pathList, "");
		for(String path:pathList){
			System.out.println(path);
		}
	}

}
