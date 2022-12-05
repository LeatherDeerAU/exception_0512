public class TraceExample {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }
    private static void b() {
        c();
    }

    private static void c() {
        System.out.println("метод ц");
        for (var trace : Thread.currentThread().getStackTrace()) {
            System.out.println(trace);
        }
    }
}
