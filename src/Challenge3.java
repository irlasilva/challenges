// == compares the address not the content
// equals compare the content

public class Challenge3 extends Thread {
    public static void main(String args[]) {
        String a = "What is Thread in Java?";
        String b = new String(a);
        int value = 0;
        value = (a == b) ? 1 : 2;
            if (value == 1) {
                System.out.println("a é igual b");
            } else if (value == 2) {
                System.out.println("a não é igual b");
            } else {
                System.out.println("Nenhum dos dois --> ERRO");
            }

        System.out.println(a.equals(b));
    }
}
