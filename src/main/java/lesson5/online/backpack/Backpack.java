package lesson5.online.backpack;

import lesson5.online.stuff.Stuff;

import java.util.List;

public class Backpack {

    private List<Stuff> bestItems;
    private final int maxWeight;
    private int bestPrice;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Stuff> getBestItems() {
        return bestItems;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getBestPrice() {
        return bestPrice;
    }

    public void setBestItems(List<Stuff> bestItems) {
        this.bestItems = bestItems;
    }

    public void setBestPrice(int bestPrice) {
        this.bestPrice = bestPrice;
    }

    public int calculateWeight(List<Stuff> stuffs) {
        return stuffs.stream().mapToInt(Stuff::getWeight).sum();
    }

    public int calculateCost(List<Stuff> stuffs) {
        return stuffs.stream().mapToInt(Stuff::getCost).sum();
    }

    public List<Stuff> GetBestSet() {
        return bestItems;
    }
}
