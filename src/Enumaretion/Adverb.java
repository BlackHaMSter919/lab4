package Enumaretion;

public enum Adverb {
    HERE,
    STRAIGHT,
    TROUGH,
    ASIF,
    LOUDLY,
    SCARED,
    JOYFULLY,

    CONTEMPTUOUSLY;

    @Override
    public String toString() {
        String res = switch (this) {
            case HERE:
                yield "тут";
            case STRAIGHT:
                yield "прямо";
            case TROUGH:
                yield "сквозь";
            case ASIF:
                yield "словно";
            case LOUDLY:
                yield "громко";
            case CONTEMPTUOUSLY:
                yield "презрительно";
            case SCARED:
                yield "испуганно";
            case JOYFULLY:
                yield "весело";
        };
        return res;
    }
}