import java.util.Scanner;

class Temp {
    static int stringToNum(String str) {
        int numEq = 0;
        if(str.charAt(8) == 'W')
            for(int i = 12; i < str.length(); i++) {
                numEq = numEq * 10 + (str.charAt(i) - 48);
            }
        if(str.charAt(0) == 'B')
            for(int i = 10; i < str.length(); i++)
                numEq = numEq * 10 + (str.charAt(i) - 48);
        
        return numEq;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while (T-- > 0) {
	        int acty = sc.nextInt();
	        sc.nextLine();
			String origin = sc.nextLine();
		
	        String [] info = new String [acty];
	        for(int i = 0; i < info.length; i++) 
				info[i] = sc.nextLine();
			
			System.out.print("String are: ");
			for(String s : info) 
				System.out.println(s);
			System.out.println("Origin is " + origin);
	        int total_laddus = 0;
	        for(int i = 0; i < info.length; i++) {
	            if(info[i].charAt(0) == 'T')
	                total_laddus += 300;
	            else {
	                 if(info[i].charAt(8) == 'H')
	                    total_laddus += 50;
	                 else {
	                      if(info[i].charAt(8) == 'W') {
							  int numEq = stringToNum(info[i]);
							  System.out.println("numEq for CONTEST_WON 1 is " + numEq);
	                          if(numEq < 20)
	                            total_laddus += 300 + 20 - numEq;
	                          else
	                            total_laddus += 300;
	                      }
	                      else {
								int numEq = stringToNum(info[i]);
								System.out.println("numEq for BUG_FOUND 100 is " + numEq);
	                            total_laddus += numEq;
	                      }
	                        
	                 }
	            }
	        }
	        
			System.out.println("total_laddus is " + total_laddus);
			String ind = "INDIAN", nonInd = "NON_INDIAN";
	        if(origin.equals(ind))
	            System.out.println("total months are/is " + total_laddus / 200);
	        if(origin.equals(nonInd))
	            System.out.println("total months are/is " + total_laddus / 400);
		}
		sc.close();
	}
}