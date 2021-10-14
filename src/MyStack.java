import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> stack = new ArrayList<T>();

    public ArrayList push(T item) {
        stack.add(item);
        return stack;
    }

    public ArrayList pop() {
        if (stack.isEmpty()){
            return null;
        }
        stack.remove(stack.size()-1);
        return stack;
    }

    public static void main(String[] args) {
        MyStack<Integer> st = new MyStack<Integer>();
        System.out.println(st.push(1));
        System.out.println(st.push(2));
        System.out.println(st.push(3));
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}