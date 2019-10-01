package com.test.pkg;

public class Runner {

	public static void main(String[] args) {
		Runner rn = new Runner();
		rn.execute();

	}

	private void execute() {
		System.out.println("=begin");
		BinaryTree top = new BinaryTree();
		top.add(1);
		top.add(2);
		top.add(3);
		top.add(4);
		System.out.println("=nodes added");		
		top.traverse();
		System.out.println("=end");
	}

}
