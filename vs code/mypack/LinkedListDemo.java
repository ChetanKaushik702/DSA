import java.util.Scanner;

class MyLinkedList<E> {
	
	Node<E> head;
	void add(E item) {
		Node<E> toAdd = new Node<>(item);

		if(isEmpty()) {
			head = toAdd;
			return;
		}
		//For traversal, follow this always
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	static class Node<E> {
		E data;
		Node<E> next;
		Node(E item) {
			data = item;
			next = null;
		}
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	public String toString() {
		Node<E> temp = head;
		if(isEmpty()) {
			return "Linked-list is empty.";
		}
		System.out.print("LinkedList: [" + temp.data);
		temp = temp.next;
		while(temp != null) {
			System.out.print(", " + temp.data);
			temp = temp.next;
		}
		return "]";
	}
	
	int indexOf(E item) {
		int count = 0, flag = 0;
		Node<E> temp = head;
		while(temp != null) {
			if(temp.data == item) {
				flag = 1;
				break;
			}
			count++;
			temp = temp.next;
		}
		if(flag == 1)
			return count;
		else
			return -1;
	}
	
	E get(int index) {
		Node<E> temp = head;
		for(int i=0;i<index;i++) 
			temp = temp.next;
		return temp.data;
	}
	
	int size() {
		int count = 0;
		Node<E> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	void insertHead(E item) {
		Node<E> addIt = new Node<>(item);
		addIt.next = head;
		head = addIt;
	}
	
	void removeFirst() {
		head = head.next;
	}
	
	void removeLast() {
		Node<E> temp = head;
		while(true) {
			if(temp.next.next == null) {
				temp.next = null;
				break;
			}
			temp = temp.next;
		}
	}
	
	void remove(E item) {
		Node<E> temp = head;
		if(head.data == item) {
			head = head.next;
			return;
		}
		while(true) {
			if(temp.next.data == item) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
		}
	}
	
	// Stack implementation using linked-list
	void stack() {
		if(head == null) {
			System.out.println("Stack Underflow.");
			return;
		}
		Node<E> temp = head; 
		Node<E> prev = head;
		while(true) {
			if(temp.next == null) {
				System.out.println(temp.data);
				if(head.next != null)
					prev.next = null;
				else
					head = null;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
	}
	static public void main(String[] args) {
		/*
		var ll = new MyLinkedList<Integer>();
		for(int i=0;i<10;i++)
			ll.add(i);
		System.out.println("Stack contents:");
		for (int i=0; i<10; i++)
			ll.stack();
		
		//Another implementation using linked-list
		var stck = new MyLinkedList<Character>();
		String symbol = "{(}[)]";
		
		var flag = true;
		
		//checking for balancing of symbols
		for (int i=0; i<symbol.length(); i++) {
			if(symbol.charAt(i) == '(' || symbol.charAt(i) == '{' || symbol.charAt(i) == '[') 
				stck.insertHead(symbol.charAt(i));
			else if(stck.isEmpty() && (symbol.charAt(i) == ')' || symbol.charAt(i) == '}' || symbol.charAt(i) == ']')) {
						flag = false;
						break;
			}
				else if(!stck.isEmpty() && (symbol.charAt(i) == ')' || symbol.charAt(i) == '}' || symbol.charAt(i) == ']')) {
						if(stck.get(0)+1 == ')' || stck.get(0)+2 == ']' || stck.get(0)+2 == '}')
							stck.removeFirst();
						else {
							flag = false;
							break;
						}
				}
		}
		if(flag)
			System.out.println("Balanced symbols.");
		else
			System.out.println("ERROR!! Unbalanced symbols.");
		*/
				//Infix to Postfix conversion using Stack data structure
		
				//1. Creating an empty stack
				MyLinkedList<Character> stk = new MyLinkedList<>();
		
				//Taking infix string as input from user
				Scanner sc = new Scanner(System.in);
				String infix = sc.nextLine();
		
				//Iterating through each character in the infix String
				for (int i=0; i<infix.length(); i++) {
						char ch = infix.charAt(i);
						
						//checking if ch is an operand
						if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z' || (ch >= 'A' && ch <= 'Z')))
							System.out.print(ch);
						
						else  {
								//checking if ch is a right parenthesis
								if (ch == ')') {
									
										//Pop and output tokens until a '(' is popped (but not output)
										while (true) {
											if(stk.get(0) == '(') {
												stk.removeFirst();
												break;
											}
											System.out.print(stk.get(0));
											stk.removeFirst();
										}
								} else {
										
										//checking for empty stack
										if (stk.isEmpty()) {
											stk.insertHead(ch);
											//System.out.println("Adding when empty: " + ch);
										}
										
										//checking for operators(*, /, +, -)
										else if (ch == '*' || ch == '+' || ch == '-' || ch == '/')  {
												while (precedence(ch) < precedence(stk.get(0)) || precedence(ch) == precedence(stk.get(0))) {
													System.out.print(stk.get(0));
													stk.removeFirst();
													if (stk.isEmpty())
														break;
												}
												stk.insertHead(ch);
											} else if (ch == '(') {
													   stk.insertHead(ch);
													   //System.out.println("Inserting left parenthesis: " + ch);
											}
												   else {
													   stk.insertHead(ch);
													   //System.out.println("Inserting: " + ch);
												   }
								}
									
						}
				}
				if(!stk.isEmpty()) {
					while (stk.head != null && stk.get(0) != '(') {
						System.out.print(stk.get(0));
						stk.removeFirst();
					}
				}
	}
	
	static int precedence(char ch) {
		if (ch == '^')
			return 3;
		else if (ch == '*' || ch == '/')
			return 2;
		else if (ch == '+' || ch == '-')
				return 1;
			 else 
				return 0;
		// ** Merging 2 sorted linked-lists
//		var ll1 = new MyLinkedList<Integer>();
//		ll1.add(4);
//		ll1.add(5);
//		ll1.add(6);
//		var ll2 = new MyLinkedList<Integer>();
//		ll2.add(1);
//		ll2.add(2);
//		ll2.add(10);
//		Node<Integer> temp2 = ll2.head;
//		Node<Integer> temp1 = ll1.head, prev1 = null;
//		
//		while (temp2 != null) {
//			Node<Integer> node = new Node<>(temp2.data);
//            while (temp1 != null) {
//                if (temp1.data > node.data) 
//                    break;
//                prev1 = temp1;
//                temp1 = temp1.next;
//            }
//            if (prev1 == null) {
//                node.next = ll1.head;
//                ll1.head = node;
//                temp1 = ll1.head;
//            } else {
//                prev1.next = node;
//                node.next = temp1;
//                prev1 = node;
//                //temp1 = node.next;
//            }
//            temp2 = temp2.next;
//        }
//		System.out.println(ll1);
		
		// Finding the middle node in linked list [ O(n) running time]
//		var ll = new MyLinkedList<Character>();
//		char ch = 'a';
//		for (int i=1; i<=2; i++)
//			ll.add(ch++);
//		System.out.println(ll);
//		Node<Character> ptr1 = ll.head, ptr2 = ll.head;
//		while (ptr2.next != null && ptr2.next.next != null) {
//			ptr1 = ptr1.next;
//			ptr2 = ptr2.next.next;
//		}
//		if (ll.size() % 2 == 0) System.out.println(ptr1.next.data);
//		else System.out.println(ptr1.data);
		
		// Modular node
//		var ll = new MyLinkedList<Integer>();
//		for (int i=1; i<=19; i++)
//			ll.add(i);
//		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
//		Node<Integer> node = null, temp = ll.head;
//		for (int i=0; i<k; i++)
//			if (temp != null)
//				temp = temp.next;
//		while (temp != null) {
//			node = node.next;
//			temp = temp.next;
//		}
//		Node<Integer> node = ll.modularNodeFromEnd(ll.head, k);
//		System.out.println(node.data);
//		System.out.println(ll);
	}
	
	public Node<E> modularNodeFromEnd(Node<E> head, int k) {
		Node<E> modularNode = null;
		int i=0;
		if (k <= 0)
			return null;
		for (i=0; i<k; i++)
			if (head !=null)
				head = null;
			else
				return null;
		while (head != null) {
			modularNode = modularNode.next;
			head = head.next;
		}
		return modularNode;
	}
}
