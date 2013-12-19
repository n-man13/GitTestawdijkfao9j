package myTreeMap;

import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;

/**
 * An academic map that does not support null keys or values. Implements a
 * subset of the methods of the java.util.TreeMap class and several other
 * methods. Methods behave as described in the documentation for
 * java.util.TreeMap with the exception of guaranteed O(log n) runtime for basic
 * operations. Since this implementation does not ensure that the tree is
 * balanced, the run time is potentially O(n).
 */
public class MyTreeMap<K extends Comparable<K>, V> {
	private TreeNode<Map.Entry<K, V>> root;
	private int size; // number of mappings

	public MyTreeMap() {
		root=new TreeNode<Map.Entry<K, V>>(null);
	}

	public int size() {
		return size;
	}

	public boolean containsKey(K key) {
		return false;
	}

	public V put(K key, V value) {
		return null;
	}

	public V get(K key) {
		return null;
	}

	public V remove(K key) {
		return null;
	}

	public Set<K> keySet() {
		return null;
	}

	/**
	 * @return the map's keys based on a preorder traversal of the tree
	 */
	public String keysPreorder() {
		return null;
	}

	private String keysPreorder(TreeNode<Map.Entry<K, V>> node) {
		return null;
	}

	/**
	 * @return the map's keys based on an inorder traversal of the tree
	 */
	public String keysInorder() {
		return null;
	}

	private String keysInorder(TreeNode<Map.Entry<K, V>> node) {
		return null;
	}

	/**
	 * @return the TreeNode (or null) to which the pointer previously pointing
	 *         to node should point
	 */
	private TreeNode<Map.Entry<K, V>> put(Map.Entry<K, V> entry,
			TreeNode<Map.Entry<K, V>> node) {
		return null;
	}

	/**
	 * @return the TreeNode (or null) to which the pointer previously pointing
	 *         to node should point
	 */
	private TreeNode<Map.Entry<K, V>> remove(K key,
			TreeNode<Map.Entry<K, V>> node) {
		return null;
	}

	/**
	 * Appends the keys from the nodes in the tree rooted at node to specified
	 * set.
	 */
	private void keySet(TreeNode<Map.Entry<K, V>> node, Set<K> keys) {

	}

	/**
	 * @return the node associated with the specified key, or null if the key is
	 *         not in the map.
	 */
	private TreeNode<Map.Entry<K, V>> getNode(K key) {
		return null;
	}

	/**
	 * @return the node in the tree rooted at node associated with the specified
	 *         key, or null if the key is not in the tree rooted at node.
	 */
	private TreeNode<Map.Entry<K, V>> getNode(K key,
			TreeNode<Map.Entry<K, V>> node) {
		return null;
	}
}
