package heap;

public class HeapMain {

	public static void main(String[] args) {
		Heap heap = new Heap(10);
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		heap.extractMin();
		heap.peek();
		heap.insert(50);
		heap.insert(60);
		heap.insert(7);
		heap.traverse();
	}
}
