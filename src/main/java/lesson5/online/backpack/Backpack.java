package lesson5.online.backpack;

import lesson5.online.stuff.Stuff;

import java.util.LinkedHashSet;
import java.util.Set;

public class Backpack {

    private final int maximumWeight;
    private int currentWeight;
    private final Set<Stuff> currentStuff;

    public Backpack(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.currentStuff = new LinkedHashSet<>();
    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public Set<Stuff> getCurrentStuff() {
        return currentStuff;
    }

    public void addStuff(Stuff stuff) {
        currentStuff.add(stuff);
        currentWeight += stuff.getWeight();
    }

    public void removeAllStuff() {
        currentStuff.clear();
        currentWeight = 0;
    }

    @Override
    public String toString() {
        return '{' + "BackPack: " + "maximumWeight=" + maximumWeight + '}';
    }
}
