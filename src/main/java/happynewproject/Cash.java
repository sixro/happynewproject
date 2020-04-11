package happynewproject;

import java.util.Objects;

/**
 * Represents cash.
 */
public final class Cash {

    private final int euro;

    /**
     * Create cash using text like {@code €5}.
     *
     * @param euroAsText euro as text
     */
    public Cash(String euroAsText) {
        this(Cash.parse(euroAsText));
    }

    /**
     * Create cash of specified euro.
     *
     * @param euro some euro
     */
    public Cash(int euro) {
        this.euro = euro;
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

    private static int parse(String euroAsText) {
        return Integer.parseInt(euroAsText.substring(1));
    }

}
