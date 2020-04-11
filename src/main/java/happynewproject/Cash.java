package happynewproject;

import java.util.Objects;

public class Cash {

    private final int euro;

    public Cash(String euroAsText) {
        this(Cash.parse(euroAsText));
    }

    public Cash(int euro) {
        this.euro = euro;
    }

    private static int parse(String euroAsText) {
        return Integer.parseInt(euroAsText.substring(1));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cash cash = (Cash) o;
        return euro == cash.euro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(euro);
    }

    @Override
    public String toString() {
        return "€" + euro;
    }
}
