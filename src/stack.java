import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        String s="(){}";
        boolean result= isValid(s);
        if(result) {
            System.out.println("Valid");
        }
        else{
            System.out.println("inValid");

        }

    }

    public static boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<Character>();
        char[] array = s.toCharArray();
        for(char ch:array){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack1.push(ch);
            }
            else{
                if(stack1.isEmpty()) return false;
                char top=stack1.pop();
                if((ch==')' && top!='(') || (ch==']' && top!='[') || (ch=='}' && top!='{')){
                    return false;
                }
            }
        }
        return stack1.isEmpty();
    }
}
