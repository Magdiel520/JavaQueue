public static void main(String[] args) {

	Queue myQueue = new Stack(6);
	myQueue.enqueue(10);
	myQueue.enqueue(20);
	myQueue.enqueue(30);
	myQueue.enqueue(40);

	while(!myQueue.isEmpty()){
		int value = myQueue.enqueue();
		System.out.print(value+"");
	}

	System.out.println("");
	
}