package treeeeeeeees;

public class HuffmanTree {
	private HuffmanTreeNode root;
	public final static char zero='0';
	public final static char one='1';
	
	public HuffmanTree(){
		root=new HuffmanTreeNode();
	}
	public void insert(char letter, String code){
		root=insert(letter, code, root);
	}
	private HuffmanTreeNode insert(char letter, String code, HuffmanTreeNode cur){
		if (code.isEmpty()){
			return new HuffmanTreeNode(letter);
		}
		if (cur==null)
			cur=new HuffmanTreeNode();
		
		char c=code.charAt(0);
		if (c==zero)
			cur.left=insert(letter, code.substring(1), cur.left);
		else
			cur.right=insert(letter, code.substring(1),cur.right);
		
		return cur;
	}
	public Character decode(String what,HuffmanTreeNode cur){
		if (cur==null)
			cur=new HuffmanTreeNode();
		if (what.isEmpty()){
			return cur.value;
		}
		char c=what.charAt(0);
		if(c==zero)
			return decode(what.substring(1), cur.left);
		else if (c==one)
			return decode(what.substring(1), cur.right);
		else 
			return null;
	}
	public HuffmanTreeNode getRoot(){
		return root;
	}
}
