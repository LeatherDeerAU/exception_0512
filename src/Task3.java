import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

class Task3 {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        Collection<String> stringArraysList = callMethod1();
        int a = 10, b = 1;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(Collection<String> stringArraysList) {
        callMethod6("");
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10);
        return new LinkedList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
        FileInputStream fis = new FileInputStream("src/resource/1.txt");


        if (fis.available() > 0) throw new RuntimeException();
        return a / b;
    }

    private static int callMethod4(String s) {
        callMethod5();
        return Integer.parseInt(s);
    }

    private static void callMethod5() {
        callMethod6("");
    }
}