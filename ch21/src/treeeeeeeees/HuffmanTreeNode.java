package treeeeeeeees;

public class HuffmanTreeNode {
	public Character value;
	public HuffmanTreeNode left;
	public HuffmanTreeNode right;

	public HuffmanTreeNode(char initValue) {
		value = initValue;
		left = null;
		right = null;
	}
	public HuffmanTreeNode(){
		value=null;
		left = null;
		right = null;
	}
}
