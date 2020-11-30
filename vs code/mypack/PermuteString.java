import java.util.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	       Scanner sc = new Scanner (System.in);
	       int T = sc.nextInt();
	       sc.nextLine();
	       while (T-- > 0) {
			   String s = sc.nextLine();
			   ArrayList<Object> str = new ArrayList<>();
	           if (s.length() == 1) System.out.print(s);
	           else if (s.length() == 2) {
				   for (int i=0; i<s.length(); i++) {
					   for (int j=0; j<s.length(); j++) {
						   if (j==i)
							   continue;
							StringBuffer out = new StringBuffer();
							out.append(s.charAt(i)).append(s.charAt(j));
							str.add(out);
					   }
				   }
			   }
	           else if (s.length() == 3) {
	               for (int i=0; i<s.length(); i++) {
	                   for (int j=0; j<s.length(); j++) {
	                       if (j == i)
	                           continue;
	                       for (int k=0; k<s.length(); k++) {
	                           if (k == j || k == i)
								   continue;
							   StringBuffer out = new StringBuffer();
							   out.append(s.charAt(i)).append(s.charAt(j)).append(s.charAt(k));
	                           str.add(out);
	                       }
	                   }
	               }
	           }else if (s.length() == 4) {
	               for (int i=0; i<s.length(); i++) {
	                   for (int j=0; j<s.length(); j++) {
	                       if (j == i)
	                           continue;
	                       for (int k=0; k<s.length(); k++) {
	                           if (k == j || k == i)
	                               continue;
	                           for (int l=0; l<s.length(); l++) {
	                               if (l==k || l==j || l==i)
									   continue;
								   StringBuffer out = new StringBuffer();
								   out.append(s.charAt(i)).append(s.charAt(j)).append(s.charAt(k)).append(s.charAt(l));
								   str.add(out);
	                           }
	                       }
	                   }
	               }
	           }else {
	               for (int i=0; i<s.length(); i++) {
	                   for (int j=0; j<s.length(); j++) {
	                       if (j == i)
	                           continue;
	                       for (int k=0; k<s.length(); k++) {
	                           if (k == j || k == i)
	                               continue;
	                           for (int l=0; l<s.length(); l++) {
	                               if (l==k || l==j || l==i)
	                                   continue;
	                               for (int m=0; m<s.length(); m++) {
	                                   if (m==l || m==k || m==j || m==i)
	                                       continue;
									   StringBuffer out = new StringBuffer();
									    out.append(s.charAt(i)).append(s.charAt(j)).append(s.charAt(k)).append(s.charAt(l)).append(s.charAt(m));
										str.add(out);
	                               }
	                           }
	                       }
	                   }
	               }
			   }
			   Object[] toSort = new Object[str.size()];
			   toSort = str.toArray();
			   Arrays.sort(toSort);
			   for (Object pmt:toSort) System.out.print(pmt + " "); 
	           System.out.println();
           }
           sc.close();
	 }
}