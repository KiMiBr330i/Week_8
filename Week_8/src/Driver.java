//-----------------------------------------------------------------------
//Lab8_Ex1, Lab8_Ex2 Kip Brower  08/29/20 CPSC 50100-002
//Driver.java - Code to remove a middle value for exercise 2 was not completed.
//Uses LinkedNode.java. Methods were adapted from the ArrayQ.java and LinkedQueue.java
// examples provided in the text/supplemental examples from class.
//-----------------------------------------------------------------------
public class Driver {
	final static int QUEUE_LIMIT = 7;
	static int frontAQ, rearAQ, countAQ;
	static int[] queue = new int[QUEUE_LIMIT];
	static LinkedNode frontLQ, nidLQ, rearLQ;
	static int countLQ;

	public static void main(String[] args) throws NullPointerException {
	// Integers can be enqueued or dequeued to either linked lists by calling one
	// of the following methods:
	// enqueueAQ or dequeueAQ - pertain to the ArrayQ method
	// enqueueLQ or dequeueLQ - pertain to the LinkedQueue method
		enqueueLQ(1);
		enqueueLQ(7);
		enqueueLQ(3);
		enqueueLQ(4);
		enqueueLQ(9);
		enqueueLQ(2);
		dequeueLQ();
		dequeueLQ();
		dequeueLQ();
		dequeueLQ();
		dequeueLQ();
		dequeueLQ();

	}
//-----------ArrayQ Methods--------------------------------
	public static void ArrayQ() {
		frontAQ = rearAQ = countAQ = 0;

	}

	public static void enqueueAQ(int a) {
		queue[rearAQ] = a;
		rearAQ = (rearAQ + 1) % queue.length;
		countAQ++;

	}

	public static int arrayCount() {
		return countAQ;
	}

	public static int dequeueAQ() {
		if (countAQ == 0)
			return -1;
		int b = queue[frontAQ];
		frontAQ = (frontAQ + 1) % queue.length;
		countAQ--;
		System.out.println(b);
		return b;

	}
//--------------ArrayQ Methods------------------------------
	public void LinkedQueue() {
		frontLQ = rearLQ = null;
		countLQ = 0;
	}

	public static void enqueueLQ(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rearLQ != null)
			rearLQ.next = newNode;
		else
			frontLQ = newNode;
		rearLQ = newNode;
		countLQ++;
		
	}

	public static int dequeueLQ() {
		if (frontLQ == null) {
			return -1;
		}
		if (frontLQ != rearLQ) {
			int x = frontLQ.c;
			frontLQ = frontLQ.next;
			countLQ--;
			System.out.println(x);
			return x;
		} else {
			int x = frontLQ.c;
			frontLQ = null;
			rearLQ = null;
			countLQ--;
			return x;

		}
		}

	
}


