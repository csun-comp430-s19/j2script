package j2script.tokens;
public class WhileToken implements Token {
    public int hashCode() {
        return 26;
    }

    public boolean equals(Object obj) {
        return obj instanceof WhileToken;
    }

    public String toString() {
        return "while";
    }
}
