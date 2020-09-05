// An implementation of IntStack that uses fixed storage.
class FixedStorage implements IntStack{
	//allocate and initialize stack
	private int stck[];
	private int tos;

	FixedStorage(int size){
		stck = new int[size];
		tos = -1;
	}

	//push an item onto the stack
	public void push(int item){
		if(tos == stck.length -1)//use length member 
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}

	//retrieve an item from the stack
	public int pop(){
		if(tos < 0)
		{	System.out.println("Stack Underflow.");
			return 0;
		}else
			return stck[tos--];
	}
}

class Stack{
	public static void main(String[] args){
		FixedStorage fs = new FixedStorage(8);

		//pushing an item on the stack
		for(int i=0;i<8;i++) fs.push(i);

		//retreive an item from the stack
		for(int i=0;i<8;i++) 
			System.out.println("Item[" + i + "] : " + fs.pop()); 
	}
}