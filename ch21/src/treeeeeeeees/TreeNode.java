package treeeeeeeees;

public class TreeNode {
	public int value;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int initValue) {
		value = initValue;
		left = null;
		right = null;
	}

	public TreeNode(int initValue, TreeNode initLeft, TreeNode initRight) {
		value = initValue;
		left = initLeft;
		right = initRight;
	}
	

	public boolean add(int value) {
		if (value == this.value)
			return false;
		else if (value < this.value) {
			if (left == null) {
				left = new TreeNode(value);
				return true;
			} else
				return left.add(value);
		} else if (value > this.value) {
			if (right == null) {
				right = new TreeNode(value);
				return true;
			} else
				return right.add(value);
		}
		return false;
	}

	public boolean remove(int val, TreeNode parent, boolean left) {
		if (val < this.value) {
			if (this.left != null)
				return this.left.remove(val, this, left);
			else
				return false;
		} 
		else if (val > this.value) {
			if (right != null)
				return right.remove(val, this, left);
			else
				return false;
		} 
		else {
			if (this.left != null && right != null) {
				this.value = right.minValue();
				right.remove(this.value, this, left);
			} 
			else if (parent.left == this) {
				parent.left = (this.left != null) ? this.left : right;
			} 
			else if (parent.right == this) {
				parent.right = (this.left != null) ? this.left : right;
			}
			return true;
		}
	}

	public int minValue() {
		if (left == null)
			return value;
		else
			return left.minValue();
	}

	public int maxValue() {
		if (right == null)
			return value;
		else
			return right.maxValue();
	}
}
