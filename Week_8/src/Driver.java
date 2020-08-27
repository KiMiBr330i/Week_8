//-----------------------------------------------------------------------
//Lab8_Ex1 Kip Brower  08/25/20 CPSC 50100-002
//Driver.java
//-----------------------------------------------------------------------
public class Driver {
final static int QUEUE_LIMIT = 7;
	static int front, rear, count;
static int[] queue;
	public static void main(String[] args) {
	enqueue(1);	
	enqueue(7);	
	enqueue(3);	
	enqueue(4);	
	enqueue(9);	
	enqueue(2);	
	
	System.out.println(count);
	}
public static void ArrayQ() {
	front = rear = count = 0;
	queue = new int[QUEUE_LIMIT];
	}


public static void enqueue(int a) {
	queue[rear] = a;
	rear = (rear+1) %queue.length;
	count++;
}
public static int arrayCount() {
	return count;
}

}
