package world_of_zulu;

public class Item {
    private String description;
    private int weight;

    public Item(String description, int weight) {
        this.description = description;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }
}
