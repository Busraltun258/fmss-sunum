package stack;
public class PrintNumbers{

    static int count=1;

    public static void printNum() {

            if (count <= 100000) {
                System.out.println("hello");
                count++;
                printNum();
            }


    }

    public static void main(String[] args) {
           printNum();
        System.out.println("bye");

    }



}