package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

public class IsLeavesAtSameLevel {
	public static boolean isLeavesAtSameLevel(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return false;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		// level delimiter
		queue.offer(null);
		int level = 0;
		boolean bLeafFound = false;
		int leafLevel = -1;

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			// Level change
			if (null == node) {
				if (!queue.isEmpty()) {
					// level delimiter
					queue.offer(null);
				}
				level++;
			} else {
				if (node.left == null && node.right == null) {
					// first leaf found
					if (bLeafFound == false) {
						bLeafFound = true;
						leafLevel = level;
					} else { // Leaves are at different level
						if (leafLevel != level) {
							return false;
						}
					}
				}
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
		}
		return true;
	}
}
