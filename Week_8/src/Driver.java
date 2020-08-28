//-----------------------------------------------------------------------
//Lab8_Ex1 Kip Brower  08/25/20 CPSC 50100-002
//Driver.java
//-----------------------------------------------------------------------
public class Driver {
	final static int QUEUE_LIMIT = 7;
	static int frontAQ, rearAQ, countAQ;
	static int[] queue = new int[QUEUE_LIMIT];
	static LinkedNode frontLQ, rearLQ;
	static int countLQ;

	public static void main(String[] args) throws NullPointerException {
		enqueueLQ(1);
		enqueueLQ(7);
		dequeueLQ();
		
		

	}

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

	public void LinkedQueue() {
		frontLQ = rearLQ = null;
		countLQ = 0;
	}

	public static void enqueueLQ(int x) {
		LinkedNode newNode = new LinkedNode();
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
	
