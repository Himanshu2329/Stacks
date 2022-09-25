import java.util.Stack;

/**
 * Intro
 */
public class Intro {

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(121);
        st.push(120);
        System.out.println(st);
        st.push(12000);
        st.push(12000);
        System.out.println(st);
        System.out.println(st.peek()+" "+ st.size());
        st.pop();
        System.out.println(st);
     }
}