// Multi-dimensional array with varying columns
class MultiDim{
	public static void main(String args[]){
		int multi_dim[][] = new int[4][];// Array declaration
	// Declaration of array columns
		multi_dim[0] = new int[1];
		multi_dim[1] = new int[2];
		multi_dim[2] = new int[3];
		multi_dim[3] = new int[4];

		int k=0; // default value of all data types is 0(false for boolean)
		for(var i=0;i<4;i++){
			for(int j=0;j<i+1;j++){
				multi_dim[i][j] = k;
				k++;
			}
		}

		//Display array 
		for(int i=0;i<4;i++){
			for(var j=0;j<i+1;j++){
				System.out.print(multi_dim[i][j] + " ");
			}
			System.out.println();
		}

	}
}