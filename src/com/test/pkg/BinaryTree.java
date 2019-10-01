package com.test.pkg;

public class BinaryTree {

	Node top;

	public void add(int value) {
		System.out.printf("\nadd start, val:%d\n", value);
		top = addRecursive(top, value);
	}

	public Node addRecursive(Node cur, int value) {
		System.out.printf("addRecursive cur:%s val:%d \n", getNode(cur), value);
		if (cur == null) {
			return new Node(value);
		}
		if (value < cur.value) {
			System.out.printf("less\n");
			cur.left = addRecursive(cur.left, value);
		} else if (value > cur.value) {
			System.out.printf("more\n");
			cur.right = addRecursive(cur.right, value);
		}
		System.out.printf("returning node :%d\n\n", value);
		return cur;

	}

	private Object getNode(Node node) {
		return (node == null) ? "null" : node.value;
	}

	public void traverse() {
		traverseRecursive(top);
	}

	public void traverseRecursive(Node node) {
		System.out.printf("traverseRecursive, node:%d\n", node != null ? node.value : null);
		if (node != null) {
			traverseRecursive(node.left);
			System.out.printf("node:%d\n", node != null ? node.value : null);
			traverseRecursive(node.right);
		}
	}
}
