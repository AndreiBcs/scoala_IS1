package Domain;

public enum NumarClasa {
    I,
    II,
    III,
    IV;

    @Override
    public String toString() {
        return switch (this) {
            case I -> "1";
            case II -> "2";
            case III -> "3";
            case IV -> "4";
        };
    }
}
