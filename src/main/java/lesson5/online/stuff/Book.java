package lesson5.online.stuff;

public class Book extends Stuff {

    private final static String NAME = "Книга";
    private final static int WEIGHT = 1;
    private final static int COST = 600;

    public Book() {
        super(NAME, WEIGHT, COST);
    }
}
