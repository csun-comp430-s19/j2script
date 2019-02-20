package j2script.tokens;
public class SemiToken implements Token {
    public int hashCode() {
        return 20;
    }

    public boolean equals(Object obj) {
        return obj instanceof SemiToken;
    }

    public String toString() {
        return ";";
    }
}
