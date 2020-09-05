// Implement a "growable" stack.
class DynamicStack implements IntStack{
	private int stck[];
	private int tos;

	//allocate and initialize stack
	DynamicStack(int size){
		stck = new int[size];
		tos = -1;
	}

	//push an item onto the stack
	public void push(int item){
		if(tos == stck.length-1){
			int temp[] = new int[2*(stck.length+1)];
			for(int i=0;i<stck.length;i++)	temp[i] = stck[i];
				stck = temp;
			stck[++tos] = item;
		}
		else
			stck[++tos] = item;
	}

	//retreive an item from the stack
	public int pop(){
		if(tos < 0){
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stck[tos--];
	}
} 

class DynStack{
	public static void main(String[] args){
		//creating an object of the DynamicStack
		DynamicStack ds = new DynamicStack(5);

		//pushing items into stack
		for(int i=0;i<12;i++) ds.push(i);

		//popping out items from the stack
		for(int i=0;i<12;i++)
			System.out.println("Item[" + i + "] : " + ds.pop());
	}
}