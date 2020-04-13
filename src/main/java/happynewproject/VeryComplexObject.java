package happynewproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

/**
 * An example.
 */
public final class VeryComplexObject {

    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 3;
    private static final int D = 4;

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final Appendable append;

    /**
     * ctor.
     *
     * @throws FileNotFoundException when default file is not available
     * @throws UnsupportedEncodingException when UTF-8 is not supported
     */
    public VeryComplexObject()
            throws FileNotFoundException, UnsupportedEncodingException {
        this(
            A,
            B,
            C,
            D,
            new PrintWriter(
                new File(
                    System.getProperty("java.io.tmpdir"),
                    "text.txt"
                ),
                "UTF-8"
            )
        );
    }

    /**
     * ctor.
     * @param a a
     * @param b b
     * @param c c
     * @param d d
     * @param append an appendable
     */
    public VeryComplexObject(int a, int b, int c, int d, Appendable append) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.append = append;
    }

    /**
     * Execute this.
     *
     * @throws IOException if nothing can be written
     */
    public void run() throws IOException {
        if (a == A) {
            if (b * C < d) {
                if (c + d == b + d) {
                    if (c > d) {
                        append.append("Hello world!");
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
        return a == that.a &&
                b == that.b &&
                c == that.c &&
                d == that.d &&
                Objects.equals(append, that.append);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d, append);
    }

    @Override
    public String toString() {
        return "VeryComplexObject{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", appendable=" + append +
                '}';
    }
}
