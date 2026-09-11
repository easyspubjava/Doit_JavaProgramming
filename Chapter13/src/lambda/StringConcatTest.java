package lambda;

public class StringConcatTest {

    public static void main(String[] args) {
        StringConcatImpl st = new StringConcatImpl();
        st.makeString("hello", "world");

        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString("hello", "world");

        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {

            }
        };



    }
}
