package lesson5.online.backpack;

public class BackPack {

    private final int weight;

    public BackPack(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return '{' + "BackPack: " + "weight=" + weight + '}';
    }
}
