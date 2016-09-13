package canyougettheloop;

public class LoopInspector {

	public int loopSize(Node node) {

		Node loopNode = getLoopNode(node);

		int size = 1;

		Node P1 = loopNode;
		Node P2 = loopNode;

		do {
			size++;
			P2 = P2.getNext();
		} while (P1 != P2);

		return (size - 1);

	}

	private Node getLoopNode(Node startNode) {
		Node slow = startNode;
		Node fast = startNode;

		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();

			if (slow == fast) {
				return slow;
			}
		}

		return null;
	}

}
