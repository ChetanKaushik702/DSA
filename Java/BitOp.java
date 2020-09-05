// Program for left-shift, right-shift and unsigned right-shift operations 
class BitOp {
	static public void main(String[] args){
		byte a = 1;
		int i;
		i = a << 8; // Firstly, a is promoted to int and then shift-left operation is performed.And finally, i becomes 256.
		System.out.println("i is: " + i);
		a = (byte) (a << 8);// Although a is first promoted to int but we use typecast operation to consider only the 8-leftmost bits.And, finally a is 0.
		System.out.println("a is: " + a);
		a = 64;
		i = a >> 2; // i becomes 16 now.
		System.out.println("i now becomes: " + i);
		a = (byte) (a >> 2);// a now becomes 0.
		System.out.println("a also becomes equal to " + a);

	}
} 