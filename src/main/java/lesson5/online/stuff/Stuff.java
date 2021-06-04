package lesson5.online.stuff;

public abstract class Stuff {

    private final String name;
    private final int weight;
    private final int cost;

    protected Stuff(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return '{' + "name='" + name + '\'' + ", weight=" + weight + ", cost=" + cost + '}';
    }
}
