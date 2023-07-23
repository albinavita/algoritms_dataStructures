import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);

        System.out.println(fibonacci(n, mem));
    }

    private static long fibonacci(int n, long[]mem) {

        if (mem[n] != -1)
            return mem[n];
        if (n <= 1)
            return n;

        long result = fibonacci(n - 1, mem) + fibonacci(n - 2, mem);
        mem[n] = result;

        return result;

    }
}