public abstract class Token {
    private String value;

    public Token(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    abstract String accept(IVisitor visitor);
}
