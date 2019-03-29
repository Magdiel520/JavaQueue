/*This is an example of Queue, in Java*/
/*It is a library control system*/

/* 	1. All books must be registered;
	2. The system must inform if a specific book
	is or not available in stock;
	3. If the book is not available, the user can wait for the book's liberation for registering in a waiting queue; and
	4. When the book is given back or liberated, the first in the queue must be contacted to take it an the library.
*/

/*	For each queue(one for each book):
	1. Keep the name and telephone of each element in the queue;
	2. The first element in the queue is always the first to bail out;
	3. The entrance occurs always by the end of the queue.
*/

/*	Every time a user demands a book, enqueue the 
	user's identifier for a future contact.
*/

public class Queue{

	private int vectorQueue[];
	private int end;

		public Queue(int max){

			vectorQueue = new int[max];
			end = -1;

		}

		//Operations isEmpty and isFull
		public boolean isEmpty(){
			return(end == -1);
		}

		public boolean isFull(){
			return(end == vectorQueue.lenght-1);
		}

		//Operation peek
		public int peek(){
			if(!isEmpty())
				return vectorQueue[0];
			else
				return -1;
		}

		//Operation enqueue
		public void enqueue(int j){
			if(!isFull()){
				end++;
				vectorQueue[end]=j;
			}
		}

		//Operation dequeue
		public int dequeue(){
			int i;
			int n;

			if(!isEmpty()){
				n = vectorQueue[0];
				for(i=0; i<end;i++)
					vectorQueue[i]=vectorQueue[i+1];
				end --;
				return n;
			}
			else
				return -1;
		}
}