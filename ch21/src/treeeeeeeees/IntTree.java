package treeeeeeeees;

public class IntTree {
	TreeNode root;

	public IntTree() {
		root = null;
	}

	public void add(int val) {
		TreeNode nT = new TreeNode(val);
		if (root == null)
			root = nT;
		else
			root.add(val);
	}

	public boolean contains(int val) {
		if (root == null)
			return false;
		else
			return contains(val, root);
	}

	private boolean contains(int val, TreeNode n) {
		if (n == null)
			return false;
		else if (n.value == val)
			return true;
		else if (n.value > val)
			return contains(val, n.left);
		else if (n.value < val)
			return contains(val, n.right);
		else
			return false;
	}

	public boolean remove(int value, boolean left) {
		if (root == null)
			return false;

		else {
			if (root.value == value) {
				TreeNode nTreeN = new TreeNode(0);
				nTreeN.left = root;
				boolean result = root.remove(value, nTreeN, left);
				root = nTreeN.left;
				return result;
			} else {
				return root.remove(value, null, left);
			}
		}

	}

	public int smallest() {
		return root.minValue();
	}
	public void printInOrder(){
		printInOrder(root);
	}
	private void printInOrder(TreeNode root){
		
	}
}
