import java.util.*;

class ProjectDemo {
    static boolean isAlphabet(char ch) {
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arraystr = s.split(" ", 0); 
        ArrayList<String> str = new ArrayList<String>();
        for(int i=0;i<arraystr.length;i++)
            str.add(arraystr[i]);
        int count = str.size();
        for(int i=0;i<str.size();i++) {
            for(int j=0;j<str.get(i).length();j++) {
                if(!isAlphabet(str.get(i).charAt(j))) {
                          
                }
            }
        }
        System.out.println(str + " " + count);
    }
}