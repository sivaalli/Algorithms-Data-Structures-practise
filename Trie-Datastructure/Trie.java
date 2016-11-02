package trieDataStructure;

public class Trie {
	//constructor
	private final TrieNode root;
	public Trie(){
		root=new TrieNode();
	}
	public void insert(String word){
		TrieNode current=root;
		char ch=' ';
		for(int i=0;i<word.length();i++){
			ch=word.charAt(i);
			TrieNode node=current.children.get(ch);
			if(node==null){
				node=new TrieNode();
				current.children.put(ch, node);
			}
			current=node;
		}
		current.endOfWord=true;
	}
	public boolean search(String word){
		TrieNode current=root;
		for(int i=0;i<word.length();i++){
			char ch=word.charAt(i);
			current=current.children.get(ch);
			if(current==null){
				return false;
			}
		}
		return current.endOfWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie dictonary=new Trie();
		dictonary.insert("abcd");
		dictonary.insert("shiva");
		dictonary.insert("siva");
		dictonary.insert("abde");
		dictonary.insert("lmn");
		dictonary.insert("love");
		if(dictonary.search("siva")){
			System.out.println("found "+"siva");
		}
		if(dictonary.search("sivapra")){
			System.out.println("found "+"sivapra");
		}
		if(dictonary.search("pra")){
			System.out.println("found "+"pra");
		}
		if(dictonary.search("lover")){
			System.out.println("found "+"lover");
		}
			
		
	}

	

}
