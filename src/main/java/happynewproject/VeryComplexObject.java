package happynewproject;

import java.time.LocalDate;
import java.util.Objects;

import static java.time.LocalDate.parse;

/**
 * An example.
 */
public final class VeryComplexObject {

    private static final LocalDate THRESHOLD_DATE = parse("2020-02-01");
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 5;

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final LocalDate time;

    /**
     * ctor.
     */
    public VeryComplexObject() {
        this(A, B, C, D, E, LocalDate.now());
    }

    /**
     * ctor.
     * @param a a
     * @param b b
     * @param c c
     * @param d d
     * @param e e
     * @param time time to use
     */
    public VeryComplexObject(int a, int b, int c, int d, int e,
                             LocalDate time) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.time = time;
    }

    /**
     * Execute this.
     */
    public void run() {
        if (a == A) {
            if (b * C < e) {
                if (c + d == b + e) {
                    if (c > d) {
                        if (time.isAfter(THRESHOLD_DATE)) {
                            System.out.println("Hello world!");
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VeryComplexObject that = (VeryComplexObject) o;
        int f = -1;
        return f == that.a
                && b == that.b
                && c == that.c
                && d == that.d
                && e == that.e
                && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d, e, time);
    }
}
