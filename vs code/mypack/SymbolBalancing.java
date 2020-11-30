import java.util.*;

public class SymbolBalancing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if (c == ']' || c == '}' || c == ')') {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }else {
                        if ((stack.peek() == '(' && c == ')') ||(stack.peek() == '[' && c == ']') || (stack.peek() == '{' && c == '}')) {
                            stack.pop();
                        }else {
                            flag = false;
                            break;
                        }
                    }
                }else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty() && flag)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        }
        sc.close();
    }
}
