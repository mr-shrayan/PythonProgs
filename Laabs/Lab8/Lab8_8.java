/*Write a program to convert character array to string object and vice
versa.*/

public class Lab8_8 {

    public static void main(String args[]) {

        char s[] = { 'S', 'h', 'r', 'a', 'y', 'a', 'n' };
        String str = new String(s);
        System.out.println(str);

        String st = "Shrayan";

        char[] ch = st.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + "\n");
        }

    }
}